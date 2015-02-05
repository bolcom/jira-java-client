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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActivityObject that = (ActivityObject) o;

        if (attachments != null ? !attachments.equals(that.attachments) : that.attachments != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) return false;
        if (downstreamDuplicates != null ? !downstreamDuplicates.equals(that.downstreamDuplicates) : that.downstreamDuplicates != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (objectType != null ? !objectType.equals(that.objectType) : that.objectType != null) return false;
        if (published != null ? !published.equals(that.published) : that.published != null) return false;
        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;
        if (updated != null ? !updated.equals(that.updated) : that.updated != null) return false;
        if (upstreamDuplicates != null ? !upstreamDuplicates.equals(that.upstreamDuplicates) : that.upstreamDuplicates != null)
            return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attachments != null ? attachments.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        result = 31 * result + (downstreamDuplicates != null ? downstreamDuplicates.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (objectType != null ? objectType.hashCode() : 0);
        result = 31 * result + (published != null ? published.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        result = 31 * result + (upstreamDuplicates != null ? upstreamDuplicates.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ActivityObject{");
        sb.append("attachments=").append(attachments);
        sb.append(", author=").append(author);
        sb.append(", content='").append(content).append('\'');
        sb.append(", displayName='").append(displayName).append('\'');
        sb.append(", downstreamDuplicates=").append(downstreamDuplicates);
        sb.append(", id='").append(id).append('\'');
        sb.append(", image=").append(image);
        sb.append(", objectType='").append(objectType).append('\'');
        sb.append(", published=").append(published);
        sb.append(", summary='").append(summary).append('\'');
        sb.append(", updated=").append(updated);
        sb.append(", upstreamDuplicates=").append(upstreamDuplicates);
        sb.append(", url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
