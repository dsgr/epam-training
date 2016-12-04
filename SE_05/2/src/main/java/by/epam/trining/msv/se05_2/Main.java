/*Задание 2. Обработка исключительных ситуаций
 *Создать “универсальный” класс, позволяющий получить значение из любого properties-файла. 
 *Физическое чтение файла должно происходить только один раз. Обработайте следующие 
 *исключительные ситуации: нет файла *.properties, нет ключа в properties-файле.
 */
package by.epam.trining.msv.se05_2;

public class Main {

	public static void main(String[] args) {

		// String path = "d:\\1";
		String path = "./src/main/resources/test.properties";
		UniversalPropertiesReader usr = new UniversalPropertiesReader(path);

		try {
			System.out.println(usr.get("k1"));
			System.out.println(usr.get("k3"));
		} catch (Exception e) {
			System.out.println("Исключение словлено!");
			e.printStackTrace();
		}

	}

}
