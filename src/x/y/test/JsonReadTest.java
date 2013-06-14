package x.y.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import x.y.rules.noun.Grammar;

import org.json.JSONObject;




public class JsonReadTest {

	public static void main(String[] args) 
	{
		//check1();
		System.out.println(" Loading grammar data ... ");
		Grammar.loadNounGrammarData();

	}	
	
//	public static List<ServiceData> getServiceDataList() {
//		List<ServiceData> data = new ArrayList<ServiceData>();
//		FileReader fr = null;
//		BufferedReader br = null;
//		try {
//			//Read the input JSON file
//			File file = new File(IConstants.PSFT_INPUT_FILE_NAME);
//			if (file.exists() && file.canRead()) {
//				System.out.println("" +
//				"[main]: Reading JSON input from input file...");
//				fr = new FileReader(file);
//				br = new BufferedReader(fr);
//				String line = null;
//				StringBuffer sb = new StringBuffer();
//				while ((line = br.readLine()) != null) {
//					sb.append(line);
//				}
//				String jsonString = sb.toString();
//				JSONObject jsonObject = new JSONObject(jsonString);
//				if (jsonObject != null) {
//					for (Object key : jsonObject.keySet()) {
//						if (key instanceof String) {
//							Object value = jsonObject.get((String)key);
//							if (value instanceof JSONObject) {
//								String opName = null;
//								String ciName = null;
//								Map<String, Object> inputMap = new LinkedHashMap<String, Object>();
//								JSONObject jv = (JSONObject)value;
//								Object o1 = jv.get(IConstants.JSON_KEY_OP_NAME);
//								if (o1 instanceof String) {
//									opName = (String)o1;
//									if (OP_NAMES.contains(opName)) {
//										Object o2 = jv.get(IConstants.JSON_KEY_CI_NAME);
//										if (o2 instanceof String) {
//											ciName = (String)o2;
//										}
//										Object o3 = jv.get(IConstants.JSON_KEY_INPUT);
//										if (o3 instanceof JSONObject) {
//											JSONObject joInput = (JSONObject)o3;
//											for (Object iKey : joInput.keySet()) {
//												if (iKey instanceof String) {
//													inputMap.put((String)iKey, joInput.get((String)iKey));
//												}
//											}
//										}
//										ServiceData serviceData = new ServiceData(opName, ciName, inputMap);
//										data.add(serviceData);
//									}
//								}
//							}
//						}
//					}
//					jsonObject.keySet();
//				}
//			}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				if (fr != null) {
//					fr.close();
//				}
//				if (br != null) {
//					br.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		return Collections.unmodifiableList(data);
//	}	
}
