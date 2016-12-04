/*Задание 1. Работа с байтовыми потоками ввода-вывода
 *Прочитайте файл, содержащий код на языке Java. Определите, какие ключевые слова языка
 *Java это код содержит. Выведите эти слова и их количество в другой файл. Используйте
 *только байтовые потоки ввода-вывода.
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
			// Создаём входной поток и считываем файл в байтовый массив
			InputStream inFile = new FileInputStream(inFilePath);
			int bytesAvailable = inFile.available();
			// Считать в массив
			bytesReaded = new byte[bytesAvailable];
			int count = inFile.read(bytesReaded, 0, bytesAvailable);
			inFile.close();
			// преобразовываем байты в строку.
			String inFileContent = new String(bytesReaded);
			//
			// Проверяем количество вхождений ключевых слов и готовим выходную
			// строку для записи
			BufferedReader inKeywords = new BufferedReader(new FileReader(inKeywordsPath));
			StringBuilder outStr = new StringBuilder();
			String str;
			while ((str = inKeywords.readLine()) != null) {
				// для поиска ключевых слов используем split
				String array[] = inFileContent.split(str);
				System.out.println(str + " > " + (array.length - 1));
				outStr.append(str + " > " + (array.length - 1) + System.lineSeparator());
			}
			inKeywords.close();
			//Записываем в файл
			OutputStream outputStream = new FileOutputStream(outFilePath);
			outputStream.write(outStr.toString().getBytes());
			outputStream.close();
			System.out.println("Результат записан в файл " + outFilePath);
			
		} catch (FileNotFoundException e) {
			System.out.println("Проверьте пути. Один из файлов не найден.");
		} catch (IOException e) {
			System.out.println("Ошибка ввода/вывода: " + e.toString());
		} 
	}
}
