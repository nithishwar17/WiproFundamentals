package wiprofundamentals;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int orginal = n;
		int rev = 0 ;
		while(n>0)
		{
			int last = n%10;
			rev=(rev*10)+last;
			n/=10;
		}
		if(rev==orginal)
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
	}
}
