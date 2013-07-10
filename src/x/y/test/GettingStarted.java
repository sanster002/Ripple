package x.y.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import de.tudarmstadt.ukp.wiktionary.api.IWiktionaryEdition;
import de.tudarmstadt.ukp.wiktionary.api.IWiktionaryEntry;
import de.tudarmstadt.ukp.wiktionary.api.Wiktionary;
import de.tudarmstadt.ukp.wiktionary.api.WordEntry;
import de.tudarmstadt.ukp.wiktionary.api.Language;

public class GettingStarted {

	/** Simple example which parses an English dump file and prints the 
	 *  entries for the word <i>Wiktionary</i>
	 *  @param args name of the dump file, output directory for parsed data, 
	 *    boolean value that specifies if existing parsed data should 
	 *    be deleted. */
	public static void main(String[] args) {
//		if (args.length != 3)
//			throw new IllegalArgumentException("Too few arguments. "
//						+ "Required arguments: <DUMP_FILE> <OUTPUT_DIRECTORY> "
//						+ "<OVERWRITE_EXISTING_DATA>");
		
		File dumpFile = new File("C://Satish//dump2.xml");	
		File outputDirectory = new File("C://Satish");
		boolean overwriteExisting = true;
		String dumpPath = "C://Satish//dump2.xml";
		
		

		// parse dump file
		System.out.println(" >>>>> " );
		System.out.println(" >>>>> " +Wiktionary.getLanguage("ENGLISH"));
		
		Wiktionary.parseWiktionaryDump(dumpFile, outputDirectory, overwriteExisting);
		
		// Create new IWiktionaryEdition for our parsed data.
		IWiktionaryEdition wkt = Wiktionary.open(outputDirectory);
		
		// Retrieve all IWiktionaryEntries for the word "Wiktionary".
		List<IWiktionaryEntry> entries = wkt.getEntriesForWord("Wiktionary");
		
		// Print the information of the parsed entries.
		System.out.println(Wiktionary.makeInfoString(entries));
		
		// Close the Wiktionary edition.
		wkt.close();	
//	
		
//		Wiktionary wiktionary = new Wiktionary(dumpFile, Language.GERMAN);
//		wiktionary.addWiktionary(DB_PATH, Language.English);
//		wiktionary.setWordLanguage(Language.German);
//		List<WiktionaryWord> wordList = wiktionary.getWords("bank");
//		wkt.close();
		


	}

}
