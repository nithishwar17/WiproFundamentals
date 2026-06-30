package wiprofundamentals;
import java.util.Scanner;
public class FindPostivie {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num>0)
			System.out.println("Positive");
		else if(num==0)
			System.out.println("Zero");
		else
			System.out.println("Negative"); 
	}
}
