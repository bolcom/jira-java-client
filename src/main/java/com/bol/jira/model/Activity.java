package com.bol.jira.model;

import org.joda.time.DateTime;

import java.net.URI;

/**
 * http://activitystrea.ms/specs/json/1.0/#activity
 */
public class Activity {
    private ActivityObject actor;
    private String content;
    private ActivityObject generator;
    private ActivityMediaLink icon;
    private URI id;
    private ActivityObject object;
    private DateTime published;
    private ActivityObject provider;
    private ActivityObject target;
    private String title;
    private DateTime updated;
    private String url;
    private String verb;

    public ActivityObject getActor() {
        return actor;
    }

    public void setActor(ActivityObject actor) {
        this.actor = actor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ActivityObject getGenerator() {
        return generator;
    }

    public void setGenerator(ActivityObject generator) {
        this.generator = generator;
    }

    public ActivityMediaLink getIcon() {
        return icon;
    }

    public void setIcon(ActivityMediaLink icon) {
        this.icon = icon;
    }

    public URI getId() {
        return id;
    }

    public void setId(URI id) {
        this.id = id;
    }

    public ActivityObject getObject() {
        return object;
    }

    public void setObject(ActivityObject object) {
        this.object = object;
    }

    public DateTime getPublished() {
        return published;
    }

    public void setPublished(DateTime published) {
        this.published = published;
    }

    public ActivityObject getProvider() {
        return provider;
    }

    public void setProvider(ActivityObject provider) {
        this.provider = provider;
    }

    public ActivityObject getTarget() {
        return target;
    }

    public void setTarget(ActivityObject target) {
        this.target = target;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DateTime getUpdated() {
        return updated;
    }

    public void setUpdated(DateTime updated) {
        this.updated = updated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activity activity = (Activity) o;

        if (actor != null ? !actor.equals(activity.actor) : activity.actor != null) return false;
        if (content != null ? !content.equals(activity.content) : activity.content != null) return false;
        if (generator != null ? !generator.equals(activity.generator) : activity.generator != null) return false;
        if (icon != null ? !icon.equals(activity.icon) : activity.icon != null) return false;
        if (id != null ? !id.equals(activity.id) : activity.id != null) return false;
        if (object != null ? !object.equals(activity.object) : activity.object != null) return false;
        if (provider != null ? !provider.equals(activity.provider) : activity.provider != null) return false;
        if (published != null ? !published.equals(activity.published) : activity.published != null) return false;
        if (target != null ? !target.equals(activity.target) : activity.target != null) return false;
        if (title != null ? !title.equals(activity.title) : activity.title != null) return false;
        if (updated != null ? !updated.equals(activity.updated) : activity.updated != null) return false;
        if (url != null ? !url.equals(activity.url) : activity.url != null) return false;
        if (verb != null ? !verb.equals(activity.verb) : activity.verb != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = actor != null ? actor.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (generator != null ? generator.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (object != null ? object.hashCode() : 0);
        result = 31 * result + (published != null ? published.hashCode() : 0);
        result = 31 * result + (provider != null ? provider.hashCode() : 0);
        result = 31 * result + (target != null ? target.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (verb != null ? verb.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Activity{");
        sb.append("actor=").append(actor);
        sb.append(", content='").append(content).append('\'');
        sb.append(", generator=").append(generator);
        sb.append(", icon=").append(icon);
        sb.append(", id=").append(id);
        sb.append(", object=").append(object);
        sb.append(", published=").append(published);
        sb.append(", provider=").append(provider);
        sb.append(", target=").append(target);
        sb.append(", title='").append(title).append('\'');
        sb.append(", updated=").append(updated);
        sb.append(", url='").append(url).append('\'');
        sb.append(", verb='").append(verb).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
