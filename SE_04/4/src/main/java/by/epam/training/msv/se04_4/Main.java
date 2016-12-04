/*������� 4. ������������
 *���� ��������� �������, ���������� ���������� �� �������, ����������� � ������� ����� 
 *(���� ����� ��� ��������� � � ���������� �������). ���������� �������� ����������,
 *����������� ��� ������� ��������������� ��������� �������, ��������� �� ��������������,
 *� �� ���������� ������ ���������� � ��������� (� ����). ��� ��������������/����������
 *��������� ������������  ������������/��������������
 */
package by.epam.training.msv.se04_4;

import java.io.InvalidObjectException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Serializator sz = new Serializator();
		String filePath = "d:\\FilmsCollection.data";
		FilmsCollection fc = null;
		// ������� ��������������� ��������� �� �����
		try {
			fc = sz.deserialize(filePath);
		} catch (InvalidObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ���������������� ���������
		System.out.println("������ �������:");
		fc.print();
		while (true) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("������� del ��� ��������.");
			System.out.println("������� add ��� ���������� ������ ������.");
			System.out.println("������� print ��� ������ ������.");
			System.out.println("������� exit ��� ������ � ���������� ����������.");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();

			if (str.equals("exit")) {
				break;
			}

			if (str.equals("print")) {
				fc.print();
			}

			if (str.equals("del")) {
				System.out.println("������� ����� ������.");
				str = sc.nextLine();
				int id = new Integer(str).intValue();
				fc.del(id);
			}

			if (str.equals("add")) {
				System.out.println("������� �������� ������.");
				String title = sc.nextLine();
				System.out.println("������� ��� �������� �����.");
				String name = sc.nextLine();
				System.out.println("������� ���� �������� �������� �����");
				String date = sc.nextLine();
				Actor actor = new Actor(name, date);
				Film film = new Film(title, actor);
				fc.add(film);
			}

		}

		// ������������
		sz.serialize(fc, filePath);
	}

}
