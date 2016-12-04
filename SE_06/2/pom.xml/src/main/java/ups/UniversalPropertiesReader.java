package ups;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class UniversalPropertiesReader {
	private Properties pr = new Properties();
	private Map<String, String> prMap = new HashMap<>();

	public UniversalPropertiesReader(String path) {
		try {
			File f = new File(path);
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
			pr.load(bis);
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Map<String, String> getMap() {
		//get enum with keys
		Enumeration<?> prNames = pr.propertyNames();
		
		while (prNames.hasMoreElements()) {
			String key = (String) prNames.nextElement();
			prMap.put(key, pr.getProperty(key));
		}
		return prMap;
	}

	public String get(String key) throws Exception {
		if (!pr.containsKey(key)) {
			throw new Exception("Ключ \"" + key + "\" не найден!");
			/*
			 * try { throw new IllegalArgumentException("Ключ \"" + key +
			 * "\" не найден!"); } catch (IllegalArgumentException e) {
			 * e.printStackTrace(); }
			 */
		}
		return pr.getProperty(key);

	}
}
