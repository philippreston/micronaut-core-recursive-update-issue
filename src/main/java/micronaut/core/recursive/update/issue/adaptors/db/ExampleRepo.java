package micronaut.core.recursive.update.issue.adaptors.db;

import reactor.core.publisher.Mono;
import micronaut.core.recursive.update.issue.domain.Example;

public interface ExampleRepo {

    public Mono<Example> find();

}
