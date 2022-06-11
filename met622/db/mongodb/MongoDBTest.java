package edu.bu.met622.db.mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Iterator;

public class MongoDBTest {

	//To directly connect to a single MongoDB server (note that this will not auto-discover the primary even
	//if it's a member of a replica set:
	public static void main(String[] args) {
//		System.out.println("-----");
//	    // initialize the client object
		MongoClient mongoClient = new MongoClient();
////		
////		// get the 'test' dataset
	    MongoDatabase dbObj = mongoClient.getDatabase( "test" );
////	    
////	    // list its collections
//	    for (String name : dbObj.listCollectionNames()) {
//	    	System.out.println("-------Collections inside this db:"+name);
//	    }
////	    // Or explicitely we can go to its collection
//	    MongoCollection<Document> col = dbObj.getCollection("inventory");
////	    // how to read the conent of a document.
//	    Iterator it = col.find().iterator();
//	    while (it.hasNext()) {
//	    	System.out.println("- documents inside the collection:" +it.next());
//	    }
//	    System.out.println("========================");
	  
	    // ---------------- insert
	    // creating a new collection
//	    dbObj.createCollection("newcolzero");
////	    
	    MongoCollection<Document> col2 = dbObj.getCollection("newcolection");
	    // insert new document into a collection	    
	    Document mydoc = new Document();
	    mydoc.put("name", "johnzzzz");
	    mydoc.put("role", "studentzzz");
	    col2.insertOne( mydoc );
//
	    MongoCollection<Document> col3 = dbObj.getCollection("newcolection");
////	    // how to read the conent of a document.
	    Iterator it2 = col3.find().iterator();
	    while (it2.hasNext()) {
	    	System.out.println("- documents inside the collection:" +it2.next());
	    }
	   
	    //--------------------- remove
	    //remove the collection	    
//	    MongoCollection<Document> collection = dbObj.getCollection("newcolection");
//	    collection.drop();
//	    MongoCollection<Document> col4 = dbObj.getCollection("newcolection");

	    //remove a document from a collection
//	    BasicDBObject doc2remove = new BasicDBObject();
//	    doc2remove.put("name","johnzzzz");
//	    col.deleteMany(doc2remove);
//	    
	}
	
	
};

