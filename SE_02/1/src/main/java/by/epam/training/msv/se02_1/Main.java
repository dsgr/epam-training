package by.epam.training.msv.se02_1;

public class Main {

	public static void main(String[] args) {
		Pen pen01 = new Pen("pen01", "red", 5000);
		Pen pen02 = pen01;
		Pen pen03 = new Pen("pen01", "red", 5000);
		Pen pen04 = new Pen("pen04", "black", 7500);
	
		System.out.println( pen01.hashCode() );
		System.out.println( pen02.hashCode() );
		System.out.println( pen03.hashCode() );
		System.out.println( pen04.hashCode() );
		
		System.out.println();
		System.out.println( pen01.equals(pen02) );
		System.out.println( pen01.equals(pen03) );
		System.out.println( pen01.equals(pen04) );
		
		
	}

}
