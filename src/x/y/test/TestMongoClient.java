package x.y.test;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.*;
import java.net.*;
import java.util.Properties;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

import java.util.*;

public class TestMongoClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		// To directly connect to a single MongoDB server (note that this will not auto-discover the primary even
		// if it's a member of a replica set:
//		MongoClient mongoClient = new MongoClient();
//		// or
//		MongoClient mongoClient = new MongoClient( "localhost" );
		// or
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
//		// or, to connect to a replica set, with auto-discovery of the primary, supply a seed list of members
//		MongoClient mongoClient = new MongoClient(Arrays.asList(new ServerAddress("localhost", 27017),
//		                                      new ServerAddress("localhost", 27018),
//		                                      new ServerAddress("localhost", 27019)));
		
		System.out.println(" Getting local DB ");
		DB db = mongoClient.getDB( "local" );
		

		
		DBCollection dbCollection = db.getCollection("testCollection");
		
		BasicDBObject doc = new BasicDBObject("name", "MongoDB").
                append("type", "database").
                append("count", 1).
                append("info", new BasicDBObject("x", 203).append("y", 102));

		dbCollection.insert(doc);
		
		DBObject myDoc = dbCollection.findOne();
		System.out.println(myDoc);
		
		System.out.println(" Getting collection names ");
		Set<String> colls = db.getCollectionNames();

		for (String s : colls) {
		    System.out.println(">> "+s);
		}

	}

	
	private static String getWordData() throws Exception{
		
        URL oracle = new URL("http://intranet.eur.ad.sag");
        
        String urlStr = "http://www.dictionaryapi.com/api/v1/references/collegiate/xml/school?key=0913ab90-d8a7-4363-85fa-4d13f76d89e2";
        URL google = new URL(urlStr);
        
        Properties systemProperties = System.getProperties();
        systemProperties.setProperty("http.proxyHost","91.195.104.74");
        systemProperties.setProperty("http.proxyPort","3128");
        
        HttpURLConnection yc = (HttpURLConnection)google.openConnection();
        yc.setRequestMethod("GET");
        yc.setDoOutput(true);
        yc.setReadTimeout(10000);
        
        
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        
        StringBuffer sb = new StringBuffer();
        
        while ((inputLine = in.readLine()) != null) 
        	sb.append(inputLine+"\n");
        in.close();
        
        String xmlString = sb.toString();
        
        return xmlString;
	}
	
	private static String convertXMLToJSON(String xmlString){
        XMLSerializer xmlSerializer = new XMLSerializer(); 
        JSON json = xmlSerializer.read( xmlString );  
        String jsonData = json.toString(2);
        
        System.out.println( " JSON : "+jsonData);	
        return jsonData;
	}
}
