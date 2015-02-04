package com.bol.jira.internal;

import com.bol.jira.JiraClientException;
import com.bol.jira.JiraServerException;
import feign.Response;
import feign.codec.ErrorDecoder;

import static feign.FeignException.errorStatus;

public class JiraErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() >= 400 && response.status() <= 499) {
            return new JiraClientException(
                    response.status(),
                    response.reason()
            );
        }
        if (response.status() >= 500 && response.status() <= 599) {
            return new JiraServerException(
                    response.status(),
                    response.reason()
            );
        }
        return errorStatus(methodKey, response);
    }
}
