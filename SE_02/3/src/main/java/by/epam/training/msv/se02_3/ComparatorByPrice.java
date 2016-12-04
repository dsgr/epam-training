package by.epam.training.msv.se02_3;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Stationery> {

	@Override
	public int compare(Stationery o1, Stationery o2) {
		Double price1 = new Double(o1.getPrice());
		Double price2 = new Double(o2.getPrice());		
		return price1.compareTo(price2);		
	}

}
