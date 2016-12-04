/*Задание 1. Обработка исключительных ситуаций
 *Разработать приложение, позволяющее просматривать файлы и каталоги файловой системы,
 *а также создавать и удалять текстовые файлы. Для работы с текстовыми файлами необходимо 
 *реализовать функциональность записи (дозаписи) в файл. Требуется определить исключения 
 *для каждого слоя приложения и корректно их обработать.
 */
package by.epam.trining.msv.se05_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String curPath = "d:\\";
		FileSystemManager fsm = new FileSystemManager(curPath);

		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("ls - просмотр директории; cd - смена директории; "
					+ "create - создание файла; add - добавление в файл.");
			String answer = sc.nextLine();
			
			if(answer.equals("ls")){
				fsm.ls();
			}
			if(answer.equals("cd")){
				System.out.println("Введите полный путь.");
				fsm.cd(sc.nextLine());
			}
			if(answer.equals("create")){
				System.out.println("Введите полный путь c именем файла.");
				fsm.create(sc.nextLine());
			}
			if(answer.equals("add")){
				System.out.println("Введите полный путь c именем файла.");
				String path = sc.nextLine();
				System.out.println("Введите текст, который нжно добавить.");
				String text = sc.nextLine();
				fsm.addToFile(path, text);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
