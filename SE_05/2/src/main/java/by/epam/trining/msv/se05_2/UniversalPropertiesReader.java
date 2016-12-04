package by.epam.trining.msv.se05_2;

import java.io.*;
import java.util.Properties;

public class UniversalPropertiesReader {
	private Properties pr = new Properties();

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

	public String get(String key) throws Exception {
		if (!pr.containsKey(key)) {

			throw new Exception("���� \"" + key + "\" �� ������!");
			/*try {
				throw new IllegalArgumentException("���� \"" + key + "\" �� ������!");
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}*/
		}
		return pr.getProperty(key);

	}
}
