package wiprofundamentals;
import java.util.Scanner;
public class asciiprint {
	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] arr = new int[n];
	for(int i=0; i<n; i++)
		arr[i]=scanner.nextInt();
	for(int i=0; i<n; i++)
		System.out.print((char) arr[i] + " ");
}
}
