/*������� 1. ������ � ��������� �������� �����-������
 *���������� ����, ���������� ��� �� ����� Java. ����������, ����� �������� ����� �����
 *Java ��� ��� ��������. �������� ��� ����� � �� ���������� � ������ ����. �����������
 *������ �������� ������ �����-������.
 */
package by.epam.training.msv.se04_1;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		String inFilePath = "d:\\Main.java";
		String outFilePath = "d:\\result.txt";
		String inKeywordsPath = "d:\\keywords";
		byte[] bytesReaded;
		try {
			//
			// ������ ������� ����� � ��������� ���� � �������� ������
			InputStream inFile = new FileInputStream(inFilePath);
			int bytesAvailable = inFile.available();
			// ������� � ������
			bytesReaded = new byte[bytesAvailable];
			int count = inFile.read(bytesReaded, 0, bytesAvailable);
			inFile.close();
			// ��������������� ����� � ������.
			String inFileContent = new String(bytesReaded);
			//
			// ��������� ���������� ��������� �������� ���� � ������� ��������
			// ������ ��� ������
			BufferedReader inKeywords = new BufferedReader(new FileReader(inKeywordsPath));
			StringBuilder outStr = new StringBuilder();
			String str;
			while ((str = inKeywords.readLine()) != null) {
				// ��� ������ �������� ���� ���������� split
				String array[] = inFileContent.split(str);
				System.out.println(str + " > " + (array.length - 1));
				outStr.append(str + " > " + (array.length - 1) + System.lineSeparator());
			}
			inKeywords.close();
			//���������� � ����
			OutputStream outputStream = new FileOutputStream(outFilePath);
			outputStream.write(outStr.toString().getBytes());
			outputStream.close();
			System.out.println("��������� ������� � ���� " + outFilePath);
			
		} catch (FileNotFoundException e) {
			System.out.println("��������� ����. ���� �� ������ �� ������.");
		} catch (IOException e) {
			System.out.println("������ �����/������: " + e.toString());
		} 
	}
}
