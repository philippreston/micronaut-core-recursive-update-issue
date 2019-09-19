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
    MongoClient mongoClient;

    @Inject
    EventManager eventManager;

    @PostConstruct
    public void init() {
        eventManager.register(collection(), "test");
    }

    @Override
    public Mono<Example> find() {
        return Flux.from(collection().find()).singleOrEmpty();
    }

    private MongoCollection<Example> collection() {
        return mongoClient.getDatabase("micronaut-core-recursive-update-issue")
                          .getCollection("example", Example.class);
    }

}