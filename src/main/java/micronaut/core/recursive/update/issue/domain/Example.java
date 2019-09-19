package micronaut.core.recursive.update.issue.domain;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonIgnore;
import org.bson.types.ObjectId;


public class Example {

    @BsonId
    private ObjectId id;

    private String data;

    public Example(ObjectId id, String data) {
        this.id = id;
        this.data = data;
    }

    public ObjectId getId() {
        return this.id;
    }

    public String getData() {
        return this.data;
    }
}