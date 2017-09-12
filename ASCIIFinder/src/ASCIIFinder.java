/**
 *
 * @author zodywoolsey
 */

import java.util.Scanner;

public class ASCIIFinder {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int asciiInt;
        char asciiChar;
        
        System.out.print("Enter an ASCII code: ");
        asciiInt = input.nextInt();
        asciiChar = (char)asciiInt;
        System.out.printf("The character for ASCII code %d is %c\n", asciiInt,asciiChar);
        
    }
    
}
