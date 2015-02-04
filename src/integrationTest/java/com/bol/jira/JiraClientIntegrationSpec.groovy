package com.bol.jira

import com.bol.jira.logging.Slf4JLogger
import com.bol.jira.model.Activity
import com.bol.jira.model.ActivityMediaLink
import com.bol.jira.model.ActivityObject
import feign.Logger
import spock.lang.IgnoreIf
import spock.lang.Specification

/**
 * Integration test specification to try stuff out against a real Jira instance.
 * <p>
 * When the following environment variables are set, this test will run:
 * <ul>
 *     <li>JIRA_URL</li>
 *     <li>JIRA_USER</li>
 *     <li>JIRA_PASSWORD</li>
 * </ul>
 */
@IgnoreIf({ !System.getenv('JIRA_URL') || !System.getenv('JIRA_USER') || !System.getenv('JIRA_PASSWORD') })
class JiraClientIntegrationSpec extends Specification {
    static final String URL_TO_JIRA = 'http://urlToJiraInstance'
    def jiraUrl = System.getenv('JIRA_URL')
    def jiraUser = System.getenv('JIRA_USER')
    def jiraPassword = System.getenv('JIRA_PASSWORD')

    def "Just try stuff out"() {
        def client = new JiraClient(jiraUrl)
        client.withFakeSSL()
        client.authenticated(jiraUser, jiraPassword)
        client.withLogger(new Slf4JLogger(), Logger.Level.FULL)
        def api = client.createClient()

        def activity = createActivity()

        expect:
        api.addActivity(activity)
    }

    def createActivity() {
        // target.url links the activity to the story
        def issueKeyToBindActivityTo = 'LA-1'

        def entry = new Activity()
        def actor = new ActivityObject()
        actor.id = 'user'
        // actor.image only works for unknown jira users, otherwise jira user image will be shown
        actor.image = new ActivityMediaLink()
        actor.image.url = URI.create('http://someUrlToImage')
        actor.image.height = 48
        actor.image.width = 148
        entry.actor = actor

        def generator = new ActivityObject()
        generator.id = URI.create(URL_TO_JIRA)
        generator.displayName = "Jira"
        entry.generator = generator

        def target = new ActivityObject()
        target.url = URI.create(issueKeyToBindActivityTo)
        entry.target = target

        def icon = new ActivityMediaLink()
        icon.url = URI.create('https://bitbucket.org/favicon.ico')
        icon.height = 16
        icon.width = 16
        entry.icon = icon

        entry.id = URI.create("${URL_TO_JIRA}/browse/LA-1")
        entry.title = "[Someone] injected a message via the Jira Activity Stream REST API"
        entry.content = "<strong>Who did this?</strong> <em>you?</em>"
        return entry
    }
}
