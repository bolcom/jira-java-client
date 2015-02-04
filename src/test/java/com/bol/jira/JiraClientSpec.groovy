package com.bol.jira

import feign.Client
import feign.Logger
import spock.lang.Specification

class JiraClientSpec extends Specification {

    def "Can create client by url"() {
        def client = JiraClient.create("url");

        expect:
        client
    }

    def "Can create authenticated client by url, username and password"() {
        def client = JiraClient.create("url", "username", "password");

        expect:
        client
    }

    def "Can create authenticated client by url, username and password with faked SSL verification"() {
        def client = JiraClient.createFakeSSL("url", "username", "password");

        expect:
        client
    }

    def "Can create authenticated client by url, username and password with custom HTTP client implementation"() {
        def client = JiraClient.create(new Client.Default(null, null), "url", "username", "password");

        expect:
        client
    }

    def "Can instantiate the JiraClient directly"() {
        def client = new JiraClient('url')

        expect:
        client
    }

    def "Can create a client directly"() {
        def client = new JiraClient('url')

        expect:
        client.createClient() instanceof JiraApi
    }

    def "Can create a client with authentication credentials"() {
        def client = new JiraClient('url')
        client.authenticated('user', 'password')

        expect:
        client.createClient() instanceof JiraApi
    }

    def "Can create a client with fake SSL support"() {
        def client = new JiraClient('url')
        client.withFakeSSL()

        expect:
        client.createClient() instanceof JiraApi
    }

    def "Can create a client with a Logger"() {
        def client = new JiraClient('url')
        client.withLogger(new Logger.JavaLogger())

        expect:
        client.createClient() instanceof JiraApi
    }

    def "Can create a client with a Logger and specify log level"() {
        def client = new JiraClient('url')
        client.withLogger(new Logger.JavaLogger(), Logger.Level.FULL)

        expect:
        client.createClient() instanceof JiraApi
    }

    def "Can create a client with a custom Client"() {
        def client = new JiraClient('url')
        client.withClient(new Client.Default(null, null))

        expect:
        client.createClient() instanceof JiraApi
    }
}
