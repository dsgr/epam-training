/*Задание 2. Использование Map
 *Создать “универсальный” класс, позволяющий получить значение из любого properties-файла.
 *Физическое чтение файла должно происходить только один раз. Результаты чтения храните в 
 *коллекции типа Map. Ответьте на вопрос: как ведет себя map-коллекция если в нее добавить 
 *элемент с ключом, который уже присутствует? 
 */

package ups;

import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// String path = "d:\\1";
		String path = "./src/main/resources/test.properties";
		UniversalPropertiesReader upr = new UniversalPropertiesReader(path);
		Map<String, String> prMap = upr.getMap();
		System.out.println(prMap);

		prMap.put("k1", "v11");
		System.out.println(prMap);
	}
}
