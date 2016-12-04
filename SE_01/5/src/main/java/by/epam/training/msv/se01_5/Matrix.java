package by.epam.training.msv.se01_5;

public class Matrix {

	public static void main(String[] args) {
		int matrixSize = 7;
		int[][] matrix = new int[matrixSize][matrixSize];

		// Create matrix.
		// Also we can use variant with 2 cycles and if statment for cheking k==i and i+k == size-1
		// but this version will work faster.
		for (int i = 0; i < matrixSize; i++) {
			matrix[i][i] = 1;
			matrix[i][matrixSize - i - 1] = 1;
		}
		
		// Print result
		for (int i = 0; i < matrixSize; i++) {
			for (int k = 0; k < matrixSize; k++) {
				System.out.print(matrix[i][k] + " ");
			}
			System.out.println();
		}
	}
}
