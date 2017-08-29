
import java.util.Scanner;

/**
 *
 * @author zodywoolsey
 * This is for the in class stuff on Aug 29.
 */
public class DataTypes {
    
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int userNumber;
        int sum;
        double avg;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        firstNumber = input.nextInt();
        System.out.print("And another: ");
        secondNumber = input.nextInt();
        //System.out.println("You Entered: " + userNumber);
        sum = firstNumber + secondNumber;
        avg = (double)sum / 2;
        System.out.println("The sum of the two numbers entered is: " + sum);
        System.out.println("The average of the two numbers is: " + avg);
    }
    
}
