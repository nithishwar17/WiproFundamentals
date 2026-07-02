package wiprofundamentals;
import java.util.Scanner;
public class ColourIdentity {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		char a = scanner.next().charAt(0);
		switch(a)
		{
			case 'R':
				System.out.print("Red");
				break;
				
			case 'B':
				System.out.print("Blue");
				break;
				
			case 'G':
				System.out.print("Green");
				break;
			case 'O':
				System.out.print("Orange");
				break;
			case 'y':
				System.out.print("Yellow");
				break;
			case 'W':
				System.out.print("White");
				break;
			default:
				System.out.print("Invalid Type");
					
		}
		
	}
}
