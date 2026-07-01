package wiprofundamentals; 

import java.util.Scanner; 

public class Checkdigitalphasysmbol { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
        char a = scanner.next().charAt(0); 

        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) 
            System.out.println("Alphabet"); 

        else if (a >= '0' && a <= '9')  
            System.out.println("Digit"); 


        else 
            System.out.println("Special Character"); 

        
        scanner.close();
    }
}
