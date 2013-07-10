package x.y.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JWKTL {

	/** Returns the software version. */
	public static String getVersion() {
		InputStream stream = JWKTL.class.getResourceAsStream("/META-INF/jwktl-version.properties");
		try {
			Properties properties = new Properties();
			try {
				properties.load(stream);
				return properties.getProperty("jwktl.version");
			} finally {
				stream.close();
			}			
		} catch (IOException e) {
			throw new RuntimeException(e);
		} 
	}
	
	
	
}
