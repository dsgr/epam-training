package by.epam.training.msv.se02_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Stationery> stationeryList = new ArrayList<>();

		stationeryList.add(new Pen("Pen-01", 5000, "black"));
		stationeryList.add(new Pen("007-Pen", 5000, "black"));
		stationeryList.add(new Notebook("Big Notebook", 15000, 150));
		stationeryList.add(new Notebook("Small Notebook", 5000, 50));

		
		System.out.println("Without sort:");
		for (Stationery list : stationeryList){
			System.out.println(list.toString());
		}
		
		System.out.println("Sort by name:");
		stationeryList.sort(new ComparatorByName());
		for (Stationery list : stationeryList){
			System.out.println(list.toString());
		}	

		System.out.println("Sort by price:");
		stationeryList.sort(new ComparatorByPrice());
		for (Stationery list : stationeryList){
			System.out.println(list.toString());
		}
		System.out.println("Sort by price and name:");
		stationeryList.sort(new ComparatorByPriceAndName());
		for (Stationery list : stationeryList){
			System.out.println(list.toString());
		}	

	}
	
}