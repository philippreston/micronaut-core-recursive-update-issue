package micronaut.core.recursive.update.issue.adaptors.db;

import micronaut.core.recursive.update.issue.domain.Example;
import micronaut.core.recursive.update.issue.events.EventManager;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoCollection;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ExampleRepoImpl implements ExampleRepo {

    @Inject
    EventManager eventManager;

    @PostConstruct
    public void init() {
        eventManager.register("test");
    }

    @Override
    public Mono<Example> find() {
        return Mono.empty();
    }


}
