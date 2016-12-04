/*������� 1. ��������� �������������� ��������
 *����������� ����������, ����������� ������������� ����� � �������� �������� �������,
 *� ����� ��������� � ������� ��������� �����. ��� ������ � ���������� ������� ���������� 
 *����������� ���������������� ������ (��������) � ����. ��������� ���������� ���������� 
 *��� ������� ���� ���������� � ��������� �� ����������.
 */
package by.epam.trining.msv.se05_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String curPath = "d:\\";
		FileSystemManager fsm = new FileSystemManager(curPath);

		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("ls - �������� ����������; cd - ����� ����������; "
					+ "create - �������� �����; add - ���������� � ����.");
			String answer = sc.nextLine();
			
			if(answer.equals("ls")){
				fsm.ls();
			}
			if(answer.equals("cd")){
				System.out.println("������� ������ ����.");
				fsm.cd(sc.nextLine());
			}
			if(answer.equals("create")){
				System.out.println("������� ������ ���� c ������ �����.");
				fsm.create(sc.nextLine());
			}
			if(answer.equals("add")){
				System.out.println("������� ������ ���� c ������ �����.");
				String path = sc.nextLine();
				System.out.println("������� �����, ������� ���� ��������.");
				String text = sc.nextLine();
				fsm.addToFile(path, text);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
