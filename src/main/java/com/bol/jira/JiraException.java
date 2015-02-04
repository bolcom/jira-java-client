package com.bol.jira;

public class JiraException extends RuntimeException {
    private int status;

    public JiraException(int status, String message, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

    public JiraException(int status, String message) {
        super(message);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
