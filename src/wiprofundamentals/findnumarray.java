package com.practice;
import java.util.Scanner;
public class findnumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=scanner.nextInt();
		System.out.print("Enter a number to check: ");
		int num = scanner.nextInt();
		int len=0;
		for(int i=0; i<n; i++)
		{
			if(num==arr[i])
			{
				System.out.print(i);
				len=1;
				break;
			}
		}
		if(len==0)
			System.out.print(-1);
		scanner.close();
	}

}
