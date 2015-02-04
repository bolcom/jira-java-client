package com.bol.jira.internal

import feign.RequestTemplate
import spock.lang.Specification
import spock.lang.Unroll

class JsonApplicationMediaTypeInterceptorSpec extends Specification {

    @Unroll
    def "Calls to [#url] get Activity Stream content-type in the header to [#contentType]"() {
        def interceptor = new JsonApplicationMediaTypeInterceptor()

        def template = new RequestTemplate()
        template.insert(0, url)
        interceptor.apply(template)

        expect:
        template.headers() == [
                "Content-Type": [contentType]
        ]

        where:
        url                    || contentType
        '/rest/activities/1.0' || 'application/vnd.atl.streams.thirdparty+json'
        '/rest/activities/1.'  || 'application/json'
        '/rest/anything-else'  || 'application/json'
    }
}
