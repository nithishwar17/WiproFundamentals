package wiprofundamentals;
import java.util.Scanner;
public class Check1or4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=scanner.nextInt();
		boolean a = true;
		for(int i=0; i<n; i++)
		{
			if((arr[i]!=1) && (arr[i]!=4))
			{
				a=false;
				break;
			}
		}
		if(a)
			System.out.println("True");
		else
			System.out.println("False");
		
	}

}
