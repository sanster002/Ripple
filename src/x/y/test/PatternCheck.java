package x.y.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternCheck {

	/**
	 * @param args
	 */

	public static final String EXAMPLE_TEST = "This is my small example string which I' m going to use for pattern matching.";

	public static final String EXAMPLE_TEST1 = "tomatoes test";
	
	public static void main(String[] args) 
	{
		//check1();
		
		Pattern pattern = Pattern.compile("\\w+");
		
		Pattern pattern1 = Pattern.compile("oes$");
		// In case you would like to ignore case sensitivity you could use this
		// statement
		// Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(EXAMPLE_TEST1);
		// Check all occurance
		while (matcher.find()) {
			System.out.print("Start index: " + matcher.start());
			System.out.print(" End index: " + matcher.end() + " ");
			System.out.println(matcher.group());
			Matcher matcher1 = pattern1.matcher(matcher.group());
			if(matcher1.find()){
				System.out.println("Matching condition : " + matcher1.group());
			}
			
		
		}
//		// Now create a new pattern and matcher to replace whitespace with tabs
//		Pattern replace = Pattern.compile("\\s+");
//		Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
//		System.out.println(matcher2.replaceAll("\t"));
	}
	
	public static void check1() 
	{
		Pattern pattern = Pattern.compile("\\w+");
		// In case you would like to ignore case sensitivity you could use this
		// statement
		// Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(EXAMPLE_TEST);
		// Check all occurance
		while (matcher.find()) {
		System.out.print("Start index: " + matcher.start());
		System.out.print(" End index: " + matcher.end() + " ");
		System.out.println(matcher.group());
		}
		// Now create a new pattern and matcher to replace whitespace with tabs
		Pattern replace = Pattern.compile("\\s+");
		Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
		System.out.println(matcher2.replaceAll("\t"));
	}	

}
