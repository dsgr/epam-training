/*Задание 3. Работа с байтовыми и символьными потоками ввода-вывода
 *Дан файл, содержащий буквы текст на кириллице. Кодировка файла utf-8. 
 *Прочитайте информацию из файла и перепишите ее в файл в кодировкой utf-16.
 */
package by.epam.training.msv.se04_3;

import java.io.*;
import org.apache.commons.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		String inPath = "D:\\work\\java_training_2015\\SE_04\\3_input\\input.txt";
		String outPath = "D:\\work\\java_training_2015\\SE_04\\3_input\\output.txt";
		InputStream in = new FileInputStream(inPath);
		OutputStream out = new FileOutputStream(outPath);

		try {
			String inStr = IOUtils.toString(in, "UTF-8");
			IOUtils.write(inStr, out, "UTF-16");
		} finally {
			IOUtils.closeQuietly(in);
			IOUtils.closeQuietly(out);
		}

	}

}
