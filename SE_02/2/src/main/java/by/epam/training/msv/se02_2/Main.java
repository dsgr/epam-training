package by.epam.training.msv.se02_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();	
		List<Stationery> stationeryList = new ArrayList<>();
		List<Stationery> stationeryList2 = new ArrayList<>();

		stationeryList.add(new Pen("Pen-01", 5000, "black"));
		stationeryList.add(new Notebook("Big Notebook", 15000, 150));
		employeeList.add(new Employee("Philip J. Fry", "Space pilot", stationeryList));
		
		stationeryList2.add(new Pen("Big Pen", 7000, "red"));
		stationeryList2.add(new Notebook("Lucky Notebook", 17000, 150));
		employeeList.add(new Employee("Bender Bending Rodriguez", "Robot", stationeryList2));
				
		System.out.println( employeeList.get(0).getFullName());
		System.out.println( employeeList.get(0).getTotalPrice());
		
		System.out.println( employeeList.get(1).getFullName());
		System.out.println( employeeList.get(1).getTotalPrice());
	}

}
