package com.bol.jira.internal;

import com.bol.jira.JiraClientException;
import com.bol.jira.JiraException;
import com.bol.jira.JiraServerException;
import feign.Response;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JiraErrorDecoderTest {

    private JiraErrorDecoder decoder = new JiraErrorDecoder();

    @Test
    public void throwsJiraClientErrorExceptionOnStatus4xxResponse() {
        String methodKey = null;
        int httpStatus = 400;
        Response response = getResponseWithStatus(httpStatus);

        Exception exception = decoder.decode(methodKey, response);

        assertTrue(exception instanceof JiraClientException);
        JiraException JiraEx = (JiraException) exception;
        assertEquals(httpStatus, JiraEx.getStatus());
    }

    @Test
    public void throwsJiraServerErrorExceptionOnStatus5xxResponse() {
        String methodKey = null;
        int httpStatus = 500;
        Response response = getResponseWithStatus(httpStatus);

        Exception exception = decoder.decode(methodKey, response);

        assertTrue(exception instanceof JiraServerException);
        JiraException JiraEx = (JiraException) exception;
        assertEquals(httpStatus, JiraEx.getStatus());
    }

    private Response getResponseWithStatus(int httpStatus) {
        Map<String, Collection<String>> headers = new LinkedHashMap<>();
        String bodyText = null;
        Charset charset = null;
        return Response.create(
                httpStatus,
                "Some error description", headers, bodyText, charset
        );
    }
}
