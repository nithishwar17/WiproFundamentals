package wiprofundamentals;
import java.util.Scanner;
public class Addbetween6and7 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=scanner.nextInt();
		}
		int sum=0;
		int count=0;
		int num=0;
		for(int i=0; i<n; i++)
		{
			if(arr[i]==6)
			{
				count=1;
				num=i;
			}
			sum+=arr[i];
			if(arr[i]==7 && count==1)
			{
				for(int j=num; j<=i; j++)
				{
					sum-=arr[j];
				}
			}
		}
		System.out.println(sum);
		scanner.close();
	}
}
