
import java.util.Scanner;

/**
 *
 * @author zodywoolsey
 */

public class PopulationProjection {
    
    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        // Creates object input of Scanner type
        Scanner input = new Scanner(System.in);
        
        // Declares variables initially
        double sPop = 312032486.0;
        double cPop;
        double years; 
        double death = 13; 
        double birth = 7; 
        double imm = 45;
        double secs;
        
        // Actual Logic for calculation
        System.out.print("Enter the number of years: ");//                                      prompt for following input
        years = input.nextDouble();//                                                           input for number of years to calculate
        secs = (years*365*24*60*60);//                                                          Calculates number of seconds in a year
        birth = secs/birth;//                                                                   Cacluacates number of births per year
        imm = secs/imm;//                                                                       Calculates the number of immigrants per year
        death = secs/death;//                                                                   Calculates the number of deaths per year
        cPop = sPop + birth + imm - death;//                                                    Adds everything up to create final population count
        System.out.println("The population in " + (int)years + " years is " + (int)cPop);//     Diplays final population count
        
    }
    
}
