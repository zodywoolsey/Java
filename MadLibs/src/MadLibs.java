import java.util.Scanner;
/**
 *
 * @author zodywoolsey
 */
public class MadLibs {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String noun1;
        String noun2;
        String adjective1;
        String adjective2;
        String verb1;
        String story1 = "The ";
        String story2 = " brown ";
        String story3 = " ";
        String story4 = " over the ";
        String story5 = " ";
        String story6 = ".";
        
        System.out.println("Please enter 2 nouns separated by a space or enter: ");
        noun1 = input.next();
        noun2 = input.next();
        System.out.println("Please enter 2 adjectives separated by a space or enter: ");
        adjective1 = input.next();
        adjective2 = input.next();
        System.out.println("Please enter a verb: ");
        verb1 = input.next();
        System.out.println(story1 + adjective1 + story2 + noun1 + story3 + verb1 + story4 + adjective2 + story5 + noun2 + story6);
        
        
    }
    
}
