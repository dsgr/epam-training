/* Задание 2. Работа с символьными потоками ввода-вывода
 * Прочитайте файл, содержащий код на языке Java. Определите, какие ключевые 
 * слова языка Java это код содержит. Выведите эти слова и их количество в 
 * другой файл. Используйте только символьные потоки ввода-вывода.
 */
package by.epam.training.msv.se04_1;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		String inFilePath = "d:\\Main.java";
		String outFilePath = "d:\\result.txt";
		String inKeywordsPath = "d:\\keywords";

		// Считываем входной файл в строку
		MyFileIO in = new MyFileIO(inFilePath);
		String inFileStr = in.readToString();

		// Считываем ключевые слова
		MyFileIO keywords = new MyFileIO(inKeywordsPath);
		ArrayList<String> keyArray = keywords.readToArrayList();

		// Поиск ключевых слов и заполнение выходной строки
		StringBuilder outStr = new StringBuilder();
		for (String str : keyArray) {
			String[] array = inFileStr.split(str);
			outStr.append(str + " > " + (array.length - 1) + System.lineSeparator());
		}

		// Запись результата в файл
		MyFileIO out = new MyFileIO(outFilePath);
		out.write(outStr.toString());

	}
}
