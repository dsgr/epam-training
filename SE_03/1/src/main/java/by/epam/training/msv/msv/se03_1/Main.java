package by.epam.training.msv.msv.se03_1;

public class Main {

	public static void main(String[] args) {
		CrazyLogger logger = new CrazyLogger();
		logger.add("Very important imformation");
		logger.add("Some message for the log");
		logger.add("Alarm!");

		logger.print();
		logger.find("message");
	}

}
