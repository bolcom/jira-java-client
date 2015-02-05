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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActivityMediaLink that = (ActivityMediaLink) o;

        if (duration != that.duration) return false;
        if (height != that.height) return false;
        if (width != that.width) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + height;
        result = 31 * result + width;
        result = 31 * result + duration;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ActivityMediaLink{");
        sb.append("url='").append(url).append('\'');
        sb.append(", height=").append(height);
        sb.append(", width=").append(width);
        sb.append(", duration=").append(duration);
        sb.append('}');
        return sb.toString();
    }
}
