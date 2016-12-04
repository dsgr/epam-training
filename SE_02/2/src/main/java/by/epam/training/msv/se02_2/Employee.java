package by.epam.training.msv.se02_2;

import java.util.List;

public class Employee {
	private String fullName;
	private String position;
	private List<Stationery> stationeryList;

	public Employee(String fullName, String position, List<Stationery> stationeryList ){
		super();
		this.fullName = fullName;
		this.position = position;
		this.stationeryList = stationeryList;
		
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public List<Stationery> getStationeryList() {
		return stationeryList;
	}

	public void setStationeryList(List<Stationery> stationeryList) {
		this.stationeryList = stationeryList;
	}

	public double getTotalPrice() {
		double totalPrice = 0;
		
		for (Stationery item : stationeryList) {
			totalPrice += item.getPrice();
		}

		return totalPrice;
	}
	
	
}
