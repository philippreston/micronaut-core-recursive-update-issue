package micronaut.core.recursive.update.issue.events;

import com.mongodb.reactivestreams.client.MongoCollection;

public interface EventManager {
    
    public void register(String id);
}
