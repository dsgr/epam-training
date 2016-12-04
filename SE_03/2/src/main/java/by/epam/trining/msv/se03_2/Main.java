package by.epam.trining.msv.se03_2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Questions q = new Questions();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("en - change to English.");
			System.out.println("ru - change to Russian.");
			System.out.println("1-" + q.getResSize() / 2 + " - get answer.");
			System.out.println("------------------------------------------");
			q.printQuestions();
			String answer = sc.nextLine();

			if (answer.equals("en")) {
				q.setLocale("en");
				continue;
			}

			if (answer.equals("ru")) {
				q.setLocale("ru");
				continue;
			}

			int intAnswer = 0;

			try {
				intAnswer = Integer.parseInt(answer);
			} catch (NumberFormatException e) {
				System.out.println("Bad comand. Try again.");
				continue;
			}

			if ((intAnswer != 0) && (intAnswer <= q.getResSize() / 2)) {
				q.getAnswer(intAnswer);
			} else {
				System.out.println("Bad comand. Try again.");
			}

		}
	}
}
