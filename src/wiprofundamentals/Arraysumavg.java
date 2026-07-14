package assessment;
import java.util.Scanner;
public class Arraysumavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int sum=0;
		for(int i=0; i<n; i++)
		{
			arr[i]=scanner.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum: " + sum + "\t Avg: " + sum/2 );
		scanner.close();
	}

}
