import java.lang.Math;

public class Cycle3 {

	public static void main(String[] args) {
		double min = 10;
		double max = 15;
		double step = 1;
		for (double i = min; i <= max; i += step  ){
		    double result = Math.tan(2 * i)-3;        
		       System.out.println(i + " - " + result); 
		    }

	}

}
