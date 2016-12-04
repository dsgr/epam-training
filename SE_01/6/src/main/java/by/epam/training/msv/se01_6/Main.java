package by.epam.training.msv.se01_6;

public class Main {

	public static void main(String[] args) {
		Notepad notepad = new Notepad(5);

		notepad.addNote("Заголовок 0", "Текст записи0");
		notepad.addNote("Заголовок 1", "Текст записи1");
		notepad.addNote("Заголовок 2", "Текст записи2");
		notepad.addNote("Заголовок 3", "Текст записи3");
		notepad.addNote("Заголовок 4", "Текст записи4");
		System.out.println("Выведем все записи:");
		notepad.showAllNotes();

		System.out.println();
		System.out.println("Поменяем запись.");
		notepad.editNote(2, "Новый заголовок 2", "Новый текст записи2");
		System.out.println("Выведем все записи:");
		notepad.showAllNotes();

		System.out.println();
		System.out.println("Удалим запись");
		notepad.deleteNote(1);
		System.out.println("Выведем все записи:");
		notepad.showAllNotes();

		System.out.println();
		System.out.println("Добавим запись");
		notepad.addNote("Заголовок", "Текст записи");
		System.out.println("Выведем все записи:");
		notepad.showAllNotes();

	}

}
