package com.bol.jira.model;

import org.joda.time.DateTime;

import java.util.List;

/**
 * http://activitystrea.ms/specs/json/1.0/#object
 */
public class ActivityObject {
    private List<ActivityObject> attachments;
    private ActivityObject author;
    private String content;
    private String displayName;
    private List<String> downstreamDuplicates;
    private String id;
    private ActivityMediaLink image;
    private String objectType;
    private DateTime published;
    private String summary;
    private DateTime updated;
    private List<String> upstreamDuplicates;
    private String url;

    public List<ActivityObject> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<ActivityObject> attachments) {
        this.attachments = attachments;
    }

    public ActivityObject getAuthor() {
        return author;
    }

    public void setAuthor(ActivityObject author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public List<String> getDownstreamDuplicates() {
        return downstreamDuplicates;
    }

    public void setDownstreamDuplicates(List<String> downstreamDuplicates) {
        this.downstreamDuplicates = downstreamDuplicates;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ActivityMediaLink getImage() {
        return image;
    }

    public void setImage(ActivityMediaLink image) {
        this.image = image;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public DateTime getPublished() {
        return published;
    }

    public void setPublished(DateTime published) {
        this.published = published;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public DateTime getUpdated() {
        return updated;
    }

    public void setUpdated(DateTime updated) {
        this.updated = updated;
    }

    public List<String> getUpstreamDuplicates() {
        return upstreamDuplicates;
    }

    public void setUpstreamDuplicates(List<String> upstreamDuplicates) {
        this.upstreamDuplicates = upstreamDuplicates;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
