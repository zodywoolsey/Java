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
        double gratP;//variable for gratuity rate after conversion to a percentage
        double gratuity;//variable for gratuity amount
        double total;//variable for total
        System.out.print("enter in the subtotal");
        subT = input.nextDouble();// input for subtotal
        System.out.print("enter in the gratutity");
        gratI = input.nextDouble();// input for the gratuity rate
        gratP = gratI/100;// reduces gratuity to a percent
        gratuity = gratP*subT;// calculates the actual gratuity amount
        total = gratuity+subT;// calculates the final total
        System.out.println("The gratutity is " + gratuity + " total is " + total);
    }
}
