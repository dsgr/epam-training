package by.epam.training.msv.se02_5;

public class Main {

	public static void main(String[] args) {
		
		Subject math = new Subject("Math", "java.lang.Integer");
		Subject history = new Subject("History", "java.lang.Double");
	
		Student student1 = new Student("student1");
		
		student1.addToSubject(math);
		student1.addToSubject(history);
		
		student1.addMark(math, 5);
		student1.addMark(math, 4);
		student1.addMark(history, 4.5);
		
		student1.getSubjects();
		student1.getMarks(history);
		student1.getMarks(math);
		

	}

}
