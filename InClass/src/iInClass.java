/**
 *
 * @author zodywoolsey
 */
import java.util.Scanner;
public class iInClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        module();
        //stringManip();
    }
    public static void module(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in a phrase");
        String userPhrase = input.nextLine();
        System.out.println("The phrase is: " + userPhrase);
        
        //convert sting to uppercase
        userPhrase = userPhrase.toUpperCase();
        System.out.println("The phrase in uppercase is: " + userPhrase);
        userPhrase = userPhrase.toLowerCase();
        System.out.println("The phrase in lowercase is: " + userPhrase);
        System.out.println("The length of the thing is: " + userPhrase.length());
        
        //To compare string values:
        String myString = "hello";
        String isMatch = "hello";
        if(myString.equals(isMatch)){
        System.out.println("Yes it does lol. ");
        
        char letter = 'A';
        System.out.println("Character value is: " + letter);

        int decLetter = (int)letter;
        System.out.println("Decimal value is " + decLetter);
        
        
        
        

        char firstLetter = userPhrase.charAt(0);
        System.out.println("The first letter is "+firstLetter);
        
        int charLetter = (int)firstLetter;
        System.out.println("The decimal value of " + firstLetter + " is: " + charLetter);
        
        int toggleCharacter;
        if (charLetter >= 65 && charLetter <= 90){
            toggleCharacter = firstLetter + 32;
        }else{
            toggleCharacter = firstLetter - 32;
        }
        
        System.out.println((char)toggleCharacter);
        
        }

}
