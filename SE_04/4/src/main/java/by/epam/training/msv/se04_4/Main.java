/*Задание 4. Сериализация
 *Дана коллекция фильмов, содержащая информацию об актерах, снимавшихся в главных ролях 
 *(один актер мог сниматься и в нескольких фильмах). Необходимо написать приложение,
 *позволяющее при запуске восстанавливать коллекцию фильмов, позволять ее модифицировать,
 *а по завершении работы приложения – сохранять (в файл). Для восстановления/сохранения
 *коллекции использовать  сериализацию/десериализацию
 */
package by.epam.training.msv.se04_4;

import java.io.InvalidObjectException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Serializator sz = new Serializator();
		String filePath = "d:\\FilmsCollection.data";
		FilmsCollection fc = null;
		// попытка десериализовать коллекцию из файла
		try {
			fc = sz.deserialize(filePath);
		} catch (InvalidObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// пользовательский интерфейс
		System.out.println("Список фильмов:");
		fc.print();
		while (true) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Введите del для удаления.");
			System.out.println("Введите add для добавления нового фильма.");
			System.out.println("Введите print для вывода списка.");
			System.out.println("Введите exit для выхода и сохранения информации.");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();

			if (str.equals("exit")) {
				break;
			}

			if (str.equals("print")) {
				fc.print();
			}

			if (str.equals("del")) {
				System.out.println("Введите номер фильма.");
				str = sc.nextLine();
				int id = new Integer(str).intValue();
				fc.del(id);
			}

			if (str.equals("add")) {
				System.out.println("Введите название фильма.");
				String title = sc.nextLine();
				System.out.println("Введите имя главного актёра.");
				String name = sc.nextLine();
				System.out.println("Введите дату рождения главного актёра");
				String date = sc.nextLine();
				Actor actor = new Actor(name, date);
				Film film = new Film(title, actor);
				fc.add(film);
			}

		}

		// сеарилизация
		sz.serialize(fc, filePath);
	}

}
