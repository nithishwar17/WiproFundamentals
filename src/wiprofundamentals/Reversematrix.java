package wiprofundamentals;

import java.util.Scanner;

public class Reversematrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[2][2];
		int n = 0;
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++) {
				arr[i][j]=Integer.parseInt(args[n]);
				n++;
			}
		}
		for(int i=1; i>=0; i--)
		{
			for(int j=1; j>=0; j--)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

}
