package com.bol.jira;

import com.bol.jira.fake.FakeHostnameVerifier;
import com.bol.jira.fake.FakeSSLSocketFactory;
import com.bol.jira.internal.JiraErrorDecoder;
import com.bol.jira.internal.JsonApplicationMediaTypeInterceptor;
import dagger.Lazy;
import feign.Client;
import feign.Feign;
import feign.Logger;
import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.jaxrs.JAXRSModule;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class JiraClient {
    private String username;
    private String password;
    private boolean requiresAuthentication = false;
    private final String url;

    private Client client;
    private Logger logger;
    private Logger.Level logLevel = Logger.Level.BASIC;

    public static JiraApi create(final String url) {
        return new JiraClient(url).createClient();
    }

    public static JiraApi create(final String url, final String username, final String password) {
        return new JiraClient(url).authenticated(username, password).createClient();
    }

    public static JiraApi create(Client client, final String url, final String username, final String password) {
        return new JiraClient(url).withClient(client).authenticated(username, password).createClient();
    }

    public static JiraApi createFakeSSL(final String url, final String username, final String password) {
        return new JiraClient(url).authenticated(username, password).withFakeSSL().createClient();
    }

    public JiraClient(final String url) {
        Objects.requireNonNull(url, "url must be provided");
        this.url = url.replaceAll("/\\z", "");
    }

    public JiraClient withClient(Client client) {
        Objects.requireNonNull(client, "client must be provided");
        this.client = client;
        return this;
    }

    public JiraClient withFakeSSL() {
        Lazy<SSLSocketFactory> sslContextFactory = new Lazy<SSLSocketFactory>() {

            private FakeSSLSocketFactory sslSocketFactory = new FakeSSLSocketFactory();

            @Override
            public SSLSocketFactory get() {
                return sslSocketFactory;
            }
        };

        Lazy<HostnameVerifier> hostnameVerifier = new Lazy<HostnameVerifier>() {

            private FakeHostnameVerifier fakeHostnameVerifier = new FakeHostnameVerifier();

            @Override
            public HostnameVerifier get() {
                return fakeHostnameVerifier;
            }
        };

        client = new Client.Default(sslContextFactory, hostnameVerifier);
        return this;
    }

    public JiraClient withLogger(Logger logger) {
        return withLogger(logger, logLevel);
    }

    public JiraClient withLogger(Logger logger, Logger.Level level) {
        Objects.requireNonNull(logger, "logger must be provided");
        Objects.requireNonNull(level, "log level must be provided");
        this.logger = logger;
        this.logLevel = level;
        return this;
    }

    public JiraClient authenticated(final String username, final String password) {
        Objects.requireNonNull(username, "username must be provided");
        Objects.requireNonNull(password, "password must be provided");
        this.username = username;
        this.password = password;
        this.requiresAuthentication = true;
        return this;
    }

    public JiraApi createClient() {
        Feign.Builder builder = Feign.builder();
        if (client != null) {
            builder.client(client);
        }
        builder.contract(new JAXRSModule.JAXRSContract())
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
                .errorDecoder(new JiraErrorDecoder())
                .requestInterceptors(getRequestInterceptors());

        if (logger != null) {
            builder.logger(logger)
                    .logLevel(logLevel);
        }
        return builder.target(JiraApi.class, url);
    }

    private Iterable<RequestInterceptor> getRequestInterceptors() {
        final List<RequestInterceptor> base = new ArrayList<RequestInterceptor>(
                Arrays.asList(new JsonApplicationMediaTypeInterceptor())
        );
        if (requiresAuthentication) {
            base.add(new BasicAuthRequestInterceptor(username, password));
        }
        return base;
    }
}
