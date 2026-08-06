package wiprofundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMiddle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		int[] c = new int[2];
		for(int i=0; i<3; i++)
			a[i]=scanner.nextInt();
		for(int i=0; i<3; i++)
			b[i]=scanner.nextInt();
		c[0]=a[1];
		c[1]=b[1];
		System.out.print(Arrays.toString(c));
	}

}
