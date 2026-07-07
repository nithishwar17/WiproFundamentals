package wiprofundamentals;
import java.util.Scanner;
public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] arr = new String[]{"Janunary","Feburary", "March","April", "May","June", "July", "August","September","Octomber","November","December"};
		if(n<=12)
			System.out.println(arr[n-1]);
		else
			System.out.print("Invalid number.");
	}

}
