package micronaut.core.recursive.update.issue.init;


import micronaut.core.recursive.update.issue.events.EventManager;
import micronaut.core.recursive.update.issue.events.EventManagerImpl;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Value;
import io.micronaut.context.annotation.Requires;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;


@Factory
public class BeanFactory {

    @Value("${micronaut.application.name}")
    private String serviceName;

    @Requires(notEnv = "test")
    @Singleton
    EventManager eventManager() {
        return new EventManagerImpl(serviceName);
    }
}