package com.bol.jira.internal;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class JsonApplicationMediaTypeInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        if (template.url().toLowerCase().startsWith("/rest/activities/1.0")) {
            template.header("Content-Type", "application/vnd.atl.streams.thirdparty+json");
        } else {
            template.header("Content-Type", "application/json");
        }
    }
}
