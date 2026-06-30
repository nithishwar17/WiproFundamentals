package wiprofundamentals;
import java.util.Scanner;
public class Samelastdigit {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt():
		if(num1%10 == num2%10)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
