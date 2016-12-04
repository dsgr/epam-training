package by.epam.training.msv.se02_3;

import java.util.Comparator;

public class ComparatorByPriceAndName implements Comparator<Stationery> {

	@Override
	public int compare(Stationery o1, Stationery o2) {
		
		Double price1 = new Double(o1.getPrice());
		Double price2 = new Double(o2.getPrice());		
		int result = price1.compareTo(price2);
		
		if(result != 0){
			return result;
		}
		return o1.getModelName().compareToIgnoreCase(o2.getModelName());
		
	}

}
