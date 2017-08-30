/**
 * @author zodywoolsey
 * This is the homework assignment called FinancialApplication.java on page 70 *2.5
 * Do not copy this or any future code from this class. I might be looking into ways to track my code later.
 */
import java.util.Scanner;//import for input

public class FinancialApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//creates a usable.... I don't know the word.... to be used for input
        double subT;//variable for subtotal
        double gratI;//variable for gratuity rate input
        double gratR;//variable for gratuity rate after conversion to a percentage
        double gratuity;//variable for gratuity amount
        double total;//variable for total
        System.out.print("Please enter the subtotal: ");
        subT = input.nextDouble();
        System.out.print("Please enter the gratuity rate: ");
        gratI = input.nextDouble();
        gratR = gratI/100;
        gratuity = gratR*subT;
        total = gratuity+subT;
        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
        
        System.out.println("TEST: " + subT + " " + gratI + ' ' + gratR+' '+gratuity+' '+total);
    }
    
}
