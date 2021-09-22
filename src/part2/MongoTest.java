package part2;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.types.ObjectId;


public class MongoTest {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017/test"));
        MongoDatabase database = mongoClient.getDatabase("test");
        MongoCollection<Document> products = database.getCollection("products");
        Document id = products.find(Filters.eq("_id", new ObjectId("5573073ba624e7ed53000755"))).first();

        if (id != null)
            System.out.println(id.toJson());
        mongoClient.close();
    }

}
