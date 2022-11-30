package MultiDimensionalArray;

import java.util.Scanner;

public class BasicOperations {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int[][]numbers = new int [row][col];
		//taking input for rows
		for(int i = 0; i < row; i++) {
			//taking input for col
			for( int j = 0; j < col; j++){
				numbers[i][j] = sc.nextInt();
			}
		}
		//Printing the array
		for(int i = 0; i < row; i++) {
			for( int j = 0; j < col; j++){
				System.out.print(numbers[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
