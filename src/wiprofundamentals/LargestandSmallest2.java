package wiprofundamentals;
import java.util.Scanner;
public class LargestandSmallest2 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=scanner.nextInt();
		int large1=0;
		int large2=0;
		for(int i=0; i<n; i++)
		{
			if(arr[i]>large1)
			{
				large2=large1;
				large1=arr[i];
			}
			else if(arr[i]>large2)
				large2=arr[i];
		}
		System.out.println("Largest1: " + large1 +", Largest2: " + large2);
		int smallest1 = Integer.MAX_VALUE;
		int smallest2 = Integer.MIN_VALUE;
		for(int i=0; i<n; i++)
		{
			if(arr[i]<smallest1)
			{
				smallest2=smallest1;
				smallest1=arr[i];
			}
			else if(arr[i]<smallest2 )
				smallest2=arr[i];
		}
		System.out.println("Smallest1: " + smallest1 +", Smallest2: " + smallest2);
		
	}
}
