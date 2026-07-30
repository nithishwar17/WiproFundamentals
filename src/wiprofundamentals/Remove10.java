package wiprofundamentals;
import java.util.Scanner;
public class Remove10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=scanner.nextInt();

		}
		int count=0;
		for(int i=0; i<n; i++)
		{
			if(arr[i]!=10)
			{
				System.out.print(arr[i] + " ");
				count++;
			}
		}
		for(int i=count; i<n; i++)
		{
			System.out.print(0 + " ");
		}
	
			
	}

}
