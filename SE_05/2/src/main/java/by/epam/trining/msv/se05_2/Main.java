/*������� 2. ��������� �������������� ��������
 *������� �������������� �����, ����������� �������� �������� �� ������ properties-�����. 
 *���������� ������ ����� ������ ����������� ������ ���� ���. ����������� ��������� 
 *�������������� ��������: ��� ����� *.properties, ��� ����� � properties-�����.
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
			System.out.println("���������� ��������!");
			e.printStackTrace();
		}

	}

}
