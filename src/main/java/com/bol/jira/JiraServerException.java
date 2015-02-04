package com.bol.jira;

public class JiraServerException extends JiraException {
    public JiraServerException(int status, String message, Throwable cause) {
        super(status, message, cause);
    }

    public JiraServerException(int status, String message) {
        super(status, message);
    }
}
