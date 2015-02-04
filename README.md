Java Client for Atlassian Jira
===============================

A *not complete* Java client for Atlassian Jira. Currently we extend it with
only what we need, but we happily apply your pull-request :D

Most of the Jira REST APIs are supported by the (official?) [Atlassian Jira REST Java Client|https://ecosystem.atlassian.net/wiki/display/JRJC/Home]

Basic usage
-----------

In its simplest form you do:

```
JiraApi api = JiraClient.create("url");
```

Each call on `api` results in a HTTP(s) call.
The JiraClient is a direct wrapper around the Jira APIs, without any beautification' whatsoever.

Follow the code-completion of your favorite IDE, it should speak for itself :)

Atlassian Jira API docs
------------------------
- [Jira REST API docs (until 6.1?)](https://developer.atlassian.com/static/rest/jira/6.1.html)
- [Jira REST API docs (6.2+?)](https://docs.atlassian.com/jira/REST/ondemand/)
