package com.bol.jira;

import com.bol.jira.model.Activity;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * <dl>
 * <dt>Jira REST API docs (until 6.1?)</dt>
 * <dd>https://developer.atlassian.com/static/rest/jira/6.1.html</dd>
 * <dt>Jira REST API docs (6.2+?)</dt>
 * <dd>https://docs.atlassian.com/jira/REST/ondemand/</dd>
 * <dt>Jira Activity Stream REST API docs</dt>
 * <dd>https://developer.atlassian.com/docs/atlassian-platform-common-components/activity-streams/adding-activities-to-a-third-party-feed-with-the-rest-api</dd>
 * <dt>Activity Stream specification</dt>
 * <dd>http://activitystrea.ms</dd>
 * <dt>Activity Streams spec explained</dt>
 * <dd>http://mariuszprzydatek.com/2013/08/28/json-activity-streams-1-0/</dd>
 * <dt>Activity Stream spec github</dt>
 * <dd>https://github.com/activitystreams</dd>
 * </dl>
 */
public interface JiraApi {
    @POST
    @Path("/rest/activities/1.0/")
    public void addActivity(
            Activity activity
    );
}
