package by.epam.training.msv.se02_3;

public class Stationery {
	private String modelName;
	private double price;
	
	public Stationery(String name, double price){
		this.modelName = name;
		this.price = price;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stationery [modelName=" + modelName + ", price=" + price + "]";
	}

	
	
	
}
