package micronaut.core.recursive.update.issue.adaptors.db;

import micronaut.core.recursive.update.issue.events.EventManager;
import micronaut.core.recursive.update.issue.events.EventManagerImpl;
import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoCollection
import spock.lang.Specification
import javax.inject.Inject
import io.micronaut.test.annotation.MicronautTest
import io.micronaut.test.annotation.MockBean

@MicronautTest
class ExampleRepoImplTest extends Specification {

    @Inject
    ExampleRepo exampleRepo

    @Inject
    MongoClient mongoClient

    @Inject
    EventManager eventManager

    def "find"() {

        when: "calling the search"
        def result = exampleRepo.find().block()

        then: "should get a list with the sign up object"
        result == null
    }

    @MockBean(EventManagerImpl)
    EventManager eventManager() {
        Mock(EventManager) {
            0 * eventManager.register(*_)
        }
    }

}