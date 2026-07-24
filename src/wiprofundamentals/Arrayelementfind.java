package com.practice;
import java.util.Scanner;
public class Arrayelementfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=scanner.nextInt();
		int num = scanner.nextInt();
		boolean found = false;
		for(int i=0; i<n; i++)
		{
			if(arr[i]==num)
			{
				System.out.print(i);
				found=true;
				break;
			}
		}
		if(!found)
			System.out.print(-1);
		scanner.close();
	}

}
