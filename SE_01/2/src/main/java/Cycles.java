//�������� ������ ����� �����, ��������� ��� ������ ������� �������, 
//� ����� ������ ������ ������� �������� �� ����������. 
//����������� ��� �������� ������.

public class Cycles {
	
	public static void main(String[] args) {
		int arraySize = 5;
		useFor(arraySize);
		useWhile(arraySize);
		useDoWhile(arraySize);
		
		
	}
	
	private static void useFor(int size){
		System.out.println("useFor:");
		//������ ������
		int[] array = new int[size];
		array[0] = 2;
		for (int i = 1; i < size; i++){
			array[i] = array[i-1]+2 ;
		}
		//������� ���������
		for (int i = 0; i < size; i++){
			System.out.print(array[i] + " ");
		}	

		//������ ����� �������� ������ ������ ������� �� ����������
		for (int i = 1; i < size; i+=2){
			array[i] *= array[i-1] ;
		}		

		//������� ���������
		System.out.println();
		for (int i = 0; i < size; i++){
			System.out.print(array[i] + " ");
		}		
		
	}
	
	private static void useWhile(int size){
		System.out.println("\nuseWhile:");
		//������ ������
		int[] array = new int[size];
		array[0] = 2;
		int i = 1;
		while (i < size){
			array[i] = array[i-1] + 2;
			i++;
		}
		
		//������� ���������
		i = 0;
		while(i < size){
			System.out.print(array[i] + " ");
			i++;
		}	

		//������ ����� �������� ������ ������ ������� �� ����������
		i = 1;
		while(i < size){
			array[i] *= array[i-1];
			i+=2;
		}			

		//������� ���������
		System.out.println();
		i = 0;
		while(i < size){
			System.out.print(array[i] + " ");
			i++;
		}	
	}
	
	private static void useDoWhile(int size){
		System.out.println("\nuseDoWhile:");
		//������ ������
		int[] array = new int[size];
		array[0] = 2;
		int i = 1;
		do{
			array[i] = array[i-1] + 2;
			i++;
		}while (i < size);
		
		//������� ���������
		i = 0;
		do {
			System.out.print(array[i] + " ");
			i++;
		}while (i < size);	

		//������ ����� �������� ������ ������ ������� �� ����������
		i = 1;
		do {
			array[i] *= array[i-1];
			i+=2;
		}while (i < size);
		
		//������� ���������
		System.out.println();
		i = 0;
		do {
			System.out.print(array[i] + " ");
			i++;
		}while (i < size);
		
	}

	
}
