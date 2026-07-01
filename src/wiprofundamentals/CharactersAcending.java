package wiprofundamentals;
import java.util.Scanner;
public class CharactersAcending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char a = scanner.next().charAt(0);
		char b = scanner.next().charAt(0);
		if(a>b)
			System.out.println(b + "," + a);
		else
			System.out.println(a + "," + b);
	}

}
