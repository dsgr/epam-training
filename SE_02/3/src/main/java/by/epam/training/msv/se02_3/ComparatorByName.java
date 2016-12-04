package by.epam.training.msv.se02_3;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Stationery> {

	@Override
	public int compare(Stationery o1, Stationery o2) {
		return o1.getModelName().compareToIgnoreCase(o2.getModelName());		
	}

}
