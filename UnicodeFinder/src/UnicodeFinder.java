/**
 *
 * @author zodywoolsey
 */

import java.util.Scanner;

public class UnicodeFinder {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int asciiInt;
        char asciiChar;
        
        System.out.print("Enter a character: ");
        asciiChar = input.next().charAt(0);
        asciiInt = (int)asciiChar;
        System.out.printf("The Unicode for the character %c is %d\n", asciiChar,asciiInt);
        
    }
    
}
