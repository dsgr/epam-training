package by.epam.trining.msv.se05_1;

import java.io.*;

public class FileSystemManager {
	String curPath;

	public FileSystemManager(String path) {
		this.curPath = path;
	}

	public void ls() {
		try {
			System.out.println("������� ������� - " + curPath);
			File fp = new File(curPath);
			String[] contents = fp.list();
			for (String item : contents) {
				System.out.println(" - " + item);
			}
		} catch (NullPointerException e) {
			System.out.println("������� �� ������!");
		}

	}

	public void cd(String path) {
		try {
			File fp = new File(path);
			if (fp.isDirectory()) {
				this.curPath = path;
				System.out.println("������� ������� ������ �� - " + curPath);
			} else {
				throw new NullPointerException(path + " �� �������� �����������");
			}
		} catch (NullPointerException e) {
			System.out.println("������� �� ������! " + e.getMessage());
		}

	}

	public void create(String path) {
		try {
			File fp = new File(path);
			if (fp.createNewFile()) {
				System.out.println("������ ���� - " + path);
			} else {
				throw new IOException("�� ������� ������� ���� - \"" + path
						+ "\". �������� ������� ������ ���� ��� ���� ��� ����������.");
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
