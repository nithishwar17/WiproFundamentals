package wiprofundamentals;
import java.util.Scanner;
public class Checkprime {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count=0;
		for(int j=1; j<=n; j++)
		{
			if(n%j==0)
				count++;
		}

		if(count==2)
			System.out.println("Prime Number");
		else
			System.out.print("Not prime Number");
	}
}
