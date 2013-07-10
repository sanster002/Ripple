package x.y.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;
import org.json.XML;
import org.json.*;
import java.net.*;
import java.util.Properties;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

public class ApacheHttpClientGet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  try {
			  
			  System.out.println("Creating the request .... ");
			  
//				DefaultHttpClient httpClient = new DefaultHttpClient();
//				HttpGet getRequest = new HttpGet(
//					"http://www.dictionaryapi.com/api/v1/references/collegiate/xml/school?key=0913ab90-d8a7-4363-85fa-4d13f76d89e2");
//				
//				//getRequest.addHeader("accept", "application/xml");
//		 
//				HttpResponse response = httpClient.execute(getRequest);
//		 
//				if (response.getStatusLine().getStatusCode() != 200) {
//					throw new RuntimeException("Failed : HTTP error code : "
//					   + response.getStatusLine().getStatusCode());
//				}
//		 
//				BufferedReader br = new BufferedReader(
//		                         new InputStreamReader((response.getEntity().getContent())));
//		 
//				String output;
//				System.out.println("Output from Server .... \n");
//				while ((output = br.readLine()) != null) {
//					System.out.println(output);
//				}
//		 
//				httpClient.getConnectionManager().shutdown();
//		 
//			  } catch (ClientProtocolException e) {
//		 
//				e.printStackTrace();
//		 
//			  } catch (IOException e) {
//		 
//				e.printStackTrace();
//			  }		
//		
//			  String urlStr = "http://www.dictionaryapi.com/api/v1/references/collegiate/xml/school?key=0913ab90-d8a7-4363-85fa-4d13f76d89e2";
//			  urlStr = "http://www.twitter.com";
//			  
//			  System.out.println(" test 1");
//			  URL url = new URL(urlStr);
//			  System.out.println(" test 2");
//			  HttpURLConnection conn =
//			      (HttpURLConnection) url.openConnection();
//			  System.out.println(" test 3");
//			  conn.setReadTimeout(5000);
//			  conn.addRequestProperty("Accept-Language", "en-US,en;q=0.8");
//			  conn.addRequestProperty("User-Agent", "Mozilla");
//			  
//			  conn.setDoOutput(true);
//			  conn.setRequestMethod("GET");
//			  
//			  System.out.println(" test 4");
//			  if (conn.getResponseCode() != 200) {
//			    throw new IOException(conn.getResponseMessage());
//			  }
//			  System.out.println(" test 4 : "+conn.getResponseCode());
//
//			  // Buffer the result into a string
//			  BufferedReader rd = new BufferedReader(
//			      new InputStreamReader(conn.getInputStream()));
//			  System.out.println(" test 5");
//			  
//			  StringBuilder sb = new StringBuilder();
//			  String line;
//			  while ((line = rd.readLine()) != null) {
//				  System.out.println(" test 6");
//			    sb.append(line);
//			  }
//			  System.out.println(" test 7");
//			  rd.close();
//
//			  conn.disconnect();
//			  System.out.println(" test 8");
//			  System.out.println(sb.toString());
//	
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
		        
//			      JSONObject xmlJsonObj=null;
//			      xmlJsonObj = XML.toJSONObject(xmlString);
//			      System.out.println(" XML : "+xmlString);
//			      System.out.println(" JSON : "+xmlJsonObj.toString(1));
		        
		        XMLSerializer xmlSerializer = new XMLSerializer(); 
                JSON json = xmlSerializer.read( xmlString );  
                System.out.println( " JSON : "+json.toString(1) );
		        
			  } catch (IOException e) {
		 
				e.printStackTrace();
			  }			
	}

}
