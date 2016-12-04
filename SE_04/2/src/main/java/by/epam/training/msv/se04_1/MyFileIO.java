package by.epam.training.msv.se04_1;

import java.util.ArrayList;
import java.io.*;

public class MyFileIO {
	private String path;

	public MyFileIO(String path) {
		this.path = path;
	}

	public ArrayList<String> readToArrayList() throws IOException {
		ArrayList<String> readedData = new ArrayList<>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String s;
			while ((s = reader.readLine()) != null) {
				readedData.add(s);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}

		return readedData;
	}

	public String readToString() throws IOException {
		StringBuilder readedData = new StringBuilder();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String s;
			while ((s = reader.readLine()) != null) {
				readedData.append(s + System.lineSeparator());
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}

		return readedData.toString();
	}

	public void write(String data) {
		try {
			FileWriter out = new FileWriter(path);
			try {
				out.write(data);
				;
			} finally {
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
}
