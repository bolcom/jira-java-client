package com.bol.jira;

public class JiraClientException extends JiraException {
    public JiraClientException(int status, String message, Throwable cause) {
        super(status, message, cause);
    }

    public JiraClientException(int status, String message) {
        super(status, message);
    }
}
