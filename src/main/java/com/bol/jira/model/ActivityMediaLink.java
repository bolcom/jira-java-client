package com.bol.jira.model;

/**
 * http://activitystrea.ms/specs/json/1.0/#media-link
 */
public class ActivityMediaLink {
    private String url;
    private int height;
    private int width;
    private int duration;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
