package x.y.test;

import org.json.*;

public class XMLToJSON {
    private static String xmlCode = 
            "<handler>"+
                "<price>10</price>"+
                "<item>rice</item>"+
                "<VALUE>3434</VALUE>"+
            "</handler>"+
            "<flow>"+
            "</flow>";
	public static void main(String[] args) throws JSONException{
	      JSONObject xmlJsonObj=null;
	      xmlJsonObj = XML.toJSONObject(xmlCode);
	      System.out.println(xmlJsonObj.toString(1));
	}
}
