package micronaut.core.recursive.update.issue.events;

import com.mongodb.reactivestreams.client.MongoCollection;

public class EventManagerImpl implements EventManager {

    private String serviceName;

    public EventManagerImpl(String serviceName) {
        this.serviceName = serviceName;
    }
    
    public void register(MongoCollection collection, String id) {

    }
}