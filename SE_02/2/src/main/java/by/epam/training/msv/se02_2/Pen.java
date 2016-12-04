package by.epam.training.msv.se02_2;

public class Pen extends Stationery{
	private String color;
		
	public Pen(String modelName, double price, String color){
		super(modelName, price);
		this.color = color;
	}
	

}

