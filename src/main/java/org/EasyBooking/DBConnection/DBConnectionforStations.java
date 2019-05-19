package org.EasyBooking.DBConnection;

import java.util.ArrayList; 
import java.util.List;

import org.EasyBooking.Details.Station;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;

public class DBConnectionforStations {
	
	 public List<Station> getAllStations() {
		 
		 	List<Station> stations = new ArrayList<>();
	        MongoClient mongoClient = null;
	        
	        try {
	            mongoClient = new MongoClient( new MongoClientURI("mongodb://localhost:27017"));

	            System.out.println("Connected to MongoDB!");
		        
		        DB database = mongoClient.getDB("EasyBooking");
		        DBCollection collection = database.getCollection("StationDetails");
		        
		        DBCursor collectionCursor = collection.find();
		        while(collectionCursor.hasNext()) {
		        	BasicDBObject col = (BasicDBObject) collectionCursor.next();
		        	System.out.println(col.get("stationName"));
		        	stations.add(new Station(col.get("stationID").toString(),(col.get("stationCode").toString()),col.get("stationName").toString()));
		        }
		        
	        } catch (MongoException e) {
	            e.printStackTrace();
	        } finally {
	            if(mongoClient!=null)
	                mongoClient.close();
	        }
			return stations;
	   
}	 
}
