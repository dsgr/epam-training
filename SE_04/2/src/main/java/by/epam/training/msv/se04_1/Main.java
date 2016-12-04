/* ������� 2. ������ � ����������� �������� �����-������
 * ���������� ����, ���������� ��� �� ����� Java. ����������, ����� �������� 
 * ����� ����� Java ��� ��� ��������. �������� ��� ����� � �� ���������� � 
 * ������ ����. ����������� ������ ���������� ������ �����-������.
 */
package by.epam.training.msv.se04_1;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		String inFilePath = "d:\\Main.java";
		String outFilePath = "d:\\result.txt";
		String inKeywordsPath = "d:\\keywords";

		// ��������� ������� ���� � ������
		MyFileIO in = new MyFileIO(inFilePath);
		String inFileStr = in.readToString();

		// ��������� �������� �����
		MyFileIO keywords = new MyFileIO(inKeywordsPath);
		ArrayList<String> keyArray = keywords.readToArrayList();

		// ����� �������� ���� � ���������� �������� ������
		StringBuilder outStr = new StringBuilder();
		for (String str : keyArray) {
			String[] array = inFileStr.split(str);
			outStr.append(str + " > " + (array.length - 1) + System.lineSeparator());
		}

		// ������ ���������� � ����
		MyFileIO out = new MyFileIO(outFilePath);
		out.write(outStr.toString());

	}
}
