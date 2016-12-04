//Создайте массив целых чисел, заполните его только четными числами, 
//а затем каждый второй элемент умножьте на предидущий. 
//Используйте все варианты циклов.

public class Cycles {
	
	public static void main(String[] args) {
		int arraySize = 5;
		useFor(arraySize);
		useWhile(arraySize);
		useDoWhile(arraySize);
		
		
	}
	
	private static void useFor(int size){
		System.out.println("useFor:");
		//создаём массив
		int[] array = new int[size];
		array[0] = 2;
		for (int i = 1; i < size; i++){
			array[i] = array[i-1]+2 ;
		}
		//выведем результат
		for (int i = 0; i < size; i++){
			System.out.print(array[i] + " ");
		}	

		//теперь будем умножать каждый второй элемент на предыдущий
		for (int i = 1; i < size; i+=2){
			array[i] *= array[i-1] ;
		}		

		//выведем результат
		System.out.println();
		for (int i = 0; i < size; i++){
			System.out.print(array[i] + " ");
		}		
		
	}
	
	private static void useWhile(int size){
		System.out.println("\nuseWhile:");
		//создаём массив
		int[] array = new int[size];
		array[0] = 2;
		int i = 1;
		while (i < size){
			array[i] = array[i-1] + 2;
			i++;
		}
		
		//выведем результат
		i = 0;
		while(i < size){
			System.out.print(array[i] + " ");
			i++;
		}	

		//теперь будем умножать каждый второй элемент на предыдущий
		i = 1;
		while(i < size){
			array[i] *= array[i-1];
			i+=2;
		}			

		//выведем результат
		System.out.println();
		i = 0;
		while(i < size){
			System.out.print(array[i] + " ");
			i++;
		}	
	}
	
	private static void useDoWhile(int size){
		System.out.println("\nuseDoWhile:");
		//создаём массив
		int[] array = new int[size];
		array[0] = 2;
		int i = 1;
		do{
			array[i] = array[i-1] + 2;
			i++;
		}while (i < size);
		
		//выведем результат
		i = 0;
		do {
			System.out.print(array[i] + " ");
			i++;
		}while (i < size);	

		//теперь будем умножать каждый второй элемент на предыдущий
		i = 1;
		do {
			array[i] *= array[i-1];
			i+=2;
		}while (i < size);
		
		//выведем результат
		System.out.println();
		i = 0;
		do {
			System.out.print(array[i] + " ");
			i++;
		}while (i < size);
		
	}

	
}
