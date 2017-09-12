/**
 *
 * @author zodywoolsey
 */
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char lett;
        int Ilett;
        char Ulett;
        
        //Gets the letter
        System.out.print("Enter a letter: ");
        lett = input.next().charAt(0);//This works way better than casting to a character because it will not break so easily and because input does not pick up initial spaces or returns
        
        //Conversion to make things easier
        Ilett = (int)lett;
        
        //Checking logic
        if (Ilett >= (int)'A' && Ilett <= (int)'z'){//Catches everything within the range of the Alphabetetic characters
            if (lett == 'A' ||lett == 'a' ||
                    lett == 'E' ||lett == 'e' ||
                    lett == 'I' ||lett == 'i' ||
                    lett == 'O' ||lett == 'o' ||
                    lett == 'U' ||lett == 'u' ||
                    lett == 'Y' ||lett == 'y'){//Logic for checking for vowels (could have been done better). Please help me find a job in programming so I can stop being so stressed out all the time.... Please... This is all I am really good at...
                System.out.printf("%c is a vowel\n", lett);
            }else{//If it is not a vowel it must be a consonant
                System.out.printf("%c is a consonant\n", lett);
            }
        }else{//Catches unaccepted inputs
            System.out.printf("%c is an invalid input\n", lett);
        }
        
    }
    
}
