package by.epam.trining.msv.se05_1;

import java.io.*;

public class FileSystemManager {
	String curPath;

	public FileSystemManager(String path) {
		this.curPath = path;
	}

	public void ls() {
		try {
			System.out.println("Текущий каталог - " + curPath);
			File fp = new File(curPath);
			String[] contents = fp.list();
			for (String item : contents) {
				System.out.println(" - " + item);
			}
		} catch (NullPointerException e) {
			System.out.println("Каталог не найден!");
		}

	}

	public void cd(String path) {
		try {
			File fp = new File(path);
			if (fp.isDirectory()) {
				this.curPath = path;
				System.out.println("Текущий каталог изменён на - " + curPath);
			} else {
				throw new NullPointerException(path + " не является директорией");
			}
		} catch (NullPointerException e) {
			System.out.println("Каталог не найден! " + e.getMessage());
		}

	}

	public void create(String path) {
		try {
			File fp = new File(path);
			if (fp.createNewFile()) {
				System.out.println("Создан файл - " + path);
			} else {
				throw new IOException("Не удалось создать файл - \"" + path
						+ "\". Возможно неверно указан путь или файл уже существует.");
			}
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void addToFile(String path, String str) {
		try {
			FileWriter out = new FileWriter(path, true);
			out.write(str);
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
