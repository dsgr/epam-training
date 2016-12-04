package by.epam.training.msv.se01_6;

public class Main {

	public static void main(String[] args) {
		Notepad notepad = new Notepad(5);

		notepad.addNote("��������� 0", "����� ������0");
		notepad.addNote("��������� 1", "����� ������1");
		notepad.addNote("��������� 2", "����� ������2");
		notepad.addNote("��������� 3", "����� ������3");
		notepad.addNote("��������� 4", "����� ������4");
		System.out.println("������� ��� ������:");
		notepad.showAllNotes();

		System.out.println();
		System.out.println("�������� ������.");
		notepad.editNote(2, "����� ��������� 2", "����� ����� ������2");
		System.out.println("������� ��� ������:");
		notepad.showAllNotes();

		System.out.println();
		System.out.println("������ ������");
		notepad.deleteNote(1);
		System.out.println("������� ��� ������:");
		notepad.showAllNotes();

		System.out.println();
		System.out.println("������� ������");
		notepad.addNote("���������", "����� ������");
		System.out.println("������� ��� ������:");
		notepad.showAllNotes();

	}

}
