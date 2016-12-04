package by.epam.training.msv.se04_4;

import java.io.Serializable;
import java.util.ArrayList;

public class FilmsCollection implements Serializable {
	private static final long serialVersionUID = 1L;
	private ArrayList<Film> collection = new ArrayList<>();
	
	public void add(Film film){
		collection.add(film);
	}
	
	public void del(int id){
		collection.remove(id);
	}

	public void print(){
		int i=0;
		for(Film f: collection){
			System.out.println(i++ + " " + f.toString());
		}
	}
}
