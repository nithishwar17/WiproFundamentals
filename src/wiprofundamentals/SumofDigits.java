package wiprofundamentals;
import java.util.Scanner;
public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum=0;
		while(n>0)
		{
			int single=n%10;
			sum+=single;
			n=n/10;
		}
		System.out.println(sum);
		
	}

}
