package x.y.rules.noun;

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

import org.json.JSONObject;
import x.y.common.*;

public class Grammar {

	public static void loadNounGrammarData() {

		FileReader fr = null;
		BufferedReader br = null;
		try {
			//Read the input JSON file
			
			File file = new File(IConstants.NOUN_GRAMAR_INPUT_FILE_NAME);
			if (file.exists() && file.canRead()) {
				System.out.println("" +
				"[main]: Reading JSON input from input file...");
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				String line = null;
				StringBuffer sb = new StringBuffer();
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}
				
				String jsonString = sb.toString();
				
				JSONObject jsonObject = new JSONObject(jsonString);
				
				if (jsonObject != null) {
					
					for (Object key : jsonObject.keySet()) {
						System.out.println(" key : "+key);
						if (key instanceof String) {
							Object value = jsonObject.get((String)key);
							System.out.println(" value : "+value);
							
							if (value instanceof JSONObject & IConstants.PATTERN_TYPE.equalsIgnoreCase((String)key)) 
							{
								
								String opName = null;
								String ciName = null;
								
								Map<String, Object> inputMap = new LinkedHashMap<String, Object>();
								
								JSONObject jv = (JSONObject)value;
								
								for (Object key1 : jv.keySet()) {
									System.out.println(" key1 : "+key1);
									if (key1 instanceof String) {
										Object value1 = jv.get((String)key1);
										System.out.println(" value1 : "+value1);
									}
								}
								
								

							}
						}
					}

				}
			}else{
				System.out.println(" File does not exist ... ");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//return Collections.unmodifiableList(data);
	}		
	
	
	public ArrayList<String> analyzeText(String text){
		
		ArrayList<String> analysisResults = new ArrayList<String>();
		
		
		return analysisResults;
		
	}
	
	
}

///////////////////////////// Garbage ////////////////

//Object o1 = jv.get(IConstants.JSON_KEY_OP_NAME);
//
//if (o1 instanceof String) {
//	opName = (String)o1;
//	if (OP_NAMES.contains(opName)) {
//		Object o2 = jv.get(IConstants.JSON_KEY_CI_NAME);
//		if (o2 instanceof String) {
//			ciName = (String)o2;
//		}
//		Object o3 = jv.get(IConstants.JSON_KEY_INPUT);
//		if (o3 instanceof JSONObject) {
//			JSONObject joInput = (JSONObject)o3;
//			for (Object iKey : joInput.keySet()) {
//				if (iKey instanceof String) {
//					inputMap.put((String)iKey, joInput.get((String)iKey));
//				}
//			}
//		}
//		ServiceData serviceData = new ServiceData(opName, ciName, inputMap);
//		data.add(serviceData);
//	}
//}

//// Noun Plurals ending with s, oes or es
//private final static String[] PATTERN_PLURAL_SUFFIX_S = {"s$", ""};
//private final static String[] PATTERN_PLURAL_SUFFIX_ES = {"es$",""};
//private final static String[] PATTERN_PLURAL_SUFFIX_OES = {"oes$","o"};
//
//// Noun Plurals ending with ies after replacing y
//private final static String[] PATTERN_PLURAL_SUFFIX_IES = {"ies$","y"};
//
//// Noun Plurals ending with ves after replacing f, fe
//private final static String[] PATTERN_PLURAL_SUFFIX_VES = {"ves$","f,fe"};
//
//// irregular plurals
//private final static String[][] PLURAL_IRREGULAR = {{"man","men"},
//	{"woman","women"}, {"child","children"}, {"tooth","teeth"},
//	{"person","people"}, {"cactus","cacti"}, {"focus", "foci"},
//	{"fungus","fungi"}, {"nucleus","nuclei"}, {"syllabus","syllabi"},
//	{"diagnosis","diagnoses"}, {"thesis","theses"}, {"phenomenon","phenomena"},
//	{"criterion","criteria"}, {"datum","data"}
//													
////													};

//String current = new java.io.File( "." ).getCanonicalPath();
//System.out.println("Current dir:"+current);
//String currentDir = System.getProperty("user.dir");
//System.out.println("Current dir using System:" +currentDir);
