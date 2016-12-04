package by.epam.trining.msv.se03_2;

import java.util.Locale;
import java.util.ResourceBundle;

public class Questions {
	private Locale curLocale = new Locale("ru");

	ResourceBundle res = ResourceBundle.getBundle("by.epam.trining.msv.se03_2.resfile", curLocale);
	private int resSize = res.keySet().size();

	public int getResSize() {
		return resSize;
	}

	void setLocale(Locale locale) {
		this.curLocale = locale;
	}

	public void printQuestions() {
		for (int i = 1; i <= (resSize / 2); i++) {
			System.out.println(i + " - " + res.getString("q" + i));
		}
	}

	public void getAnswer(int i) {
		System.out.println(res.getString("a" + i));

	}

	public void setLocale(String str) {
		curLocale = new Locale(str);
		res = ResourceBundle.getBundle("by.epam.trining.msv.se03_2.resfile", curLocale);
	}

}
