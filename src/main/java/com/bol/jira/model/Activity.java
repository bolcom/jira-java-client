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
}
