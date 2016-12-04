package by.epam.training.msv.se04_4;

import java.io.*;

public class Serializator {
	public boolean serialize(FilmsCollection fc, String filePath) {
		boolean flag = false;
		File file = new File(filePath);
		ObjectOutputStream oos = null;

		try {
			FileOutputStream fos = new FileOutputStream(file);
			if (fos != null) {
				oos = new ObjectOutputStream(fos);
				oos.writeObject(fc); // сериализация
				flag = true;
			}
		} catch (FileNotFoundException e) {
			System.err.println("Файл не может  быть создан: " + e);
		} catch (NotSerializableException e) {
			System.err.println("Класс  не поддерживает  сериализацию : " + e);
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				System.err.println("ошибка закрытия потока");
			}
		}
		return flag;
	}

	public FilmsCollection deserialize(String filePath) throws InvalidObjectException {
		File f = new File(filePath);
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			return (FilmsCollection) ois.readObject();
		} catch (ClassNotFoundException ce) {
			System.err.println("Класс не существует: " + ce);
		} catch (FileNotFoundException e) {
			System.err.println("Файл для десериализации не существует: " + e);
		} catch (InvalidClassException ioe) {
			System.err.println("Несовпадение версий классов: " + ioe);
		} catch (IOException ioe) {
			System.err.println("Общая I/O ошибка: " + ioe);
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				System.err.println("Ошибка закрытия потока ");
			}

		}
		throw new InvalidObjectException("Объект не восстановлен");

	}
}
