
/**
 *
 * @author zodywoolsey
 */
public class SwitchStatements {
    public static void main(String[] args) {
        int dayOfWeek = 5;
        switch (dayOfWeek){
            case 1:
            case 2:
                System.out.print("You can skip lines.");
                break;
            case 4:
            case 5: 
                System.out.print("Weekday");
                break;
            case 6:
            case 7:
                System.out.print("Weekend");
                break;
            default:
                System.out.print("oops");
        }
    }
    
}
