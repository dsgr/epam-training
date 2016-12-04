package by.epam.training.msv.msv.se03_1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CrazyLogger {
	private ArrayList<String> logger;
	
	public CrazyLogger(){
		logger = new ArrayList();
	}
	public void add(String message){
		StringBuilder str = new StringBuilder();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-YYYY : hh-mm"); 
		Date currentDate = new Date(); 
		
		str.append(sdf.format(currentDate));
		str.append(" - ");
		str.append(message);
		
		logger.add(str.toString());
	}
	
	public void print(){
		for(String s: logger){
			System.out.println(s);
		}	
	}
	
	public void find(String str){
		for(String s: logger){
			
			if(s.contains(str)){
				System.out.println(s);	
			}
		}	
	}
	
	
	
	
	
}
