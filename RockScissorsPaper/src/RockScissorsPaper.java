import java.util.Scanner;
/**
 *
 * @author zodywoolsey
 */
public class RockScissorsPaper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creates input object
        Scanner input = new Scanner(System.in);
        
        //declares variables
        int rock;
        int paper;
        int scissors; 
        int playerPick;
        int compPick;
        while (true){
            
            System.out.println("Please choose: rock(1), paper(2), scissors(3), or enter (0) to exit the program: ");
            
            playerPick = input.nextInt();
            compPick = (int)(1+Math.random()*3);
            
            if (compPick == 1){
                System.out.println("The computer chose rock. ");
            }
            else if(compPick == 2){
                System.out.println("The computer chose paper. ");
            }
            else if(compPick == 3){
                System.out.println("The computer chose scissors. ");
            }
            
            if (playerPick == 1){
                System.out.println("You chose rock. ");
                if (compPick == 1){
                System.out.println("TIE!");
                }
                else if(compPick == 2){
                    System.out.println("Sorry you lost.");
                }
                else if(compPick == 3){
                    System.out.println("You WIN!!");
                }
            }
            else if(playerPick == 2){
                System.out.println("You chose paper. ");
                if (compPick == 1){
                System.out.println("You WIN!!");
                }
                else if(compPick == 2){
                    System.out.println("TIE!");
                }
                else if(compPick == 3){
                    System.out.println("Sorry you lost.");
                }
            }
            else if(playerPick == 3){
                System.out.println("You chose scissors. ");
                if (compPick == 1){
                System.out.println("Sorry you lost.");
                }
                else if(compPick == 2){
                    System.out.println("You WIN!!");
                }
                else if(compPick == 3){
                    System.out.println("TIE!");
                }
            }
            else if(playerPick == 0){
                System.out.println("Thank you for playing!");
                break;
            }
            
        }
        
        System.out.println();
        
    }
}
