/**
 *
 * @author zodywoolsey
 */
import java.util.Scanner;
public class CitySorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cityOne = "non";
        String cityOneC = "non";
        String cityTwo = "non";
        String cityTwoC = "non";
        String cityThree = "non";
        String cityThreeC = "non";
        String one = "non";
        String two = "non";
        String three = "non";
        
        System.out.print("Enter the first city: ");
        cityOne = input.nextLine();
        System.out.print("Enter the second city: ");
        cityTwo = input.nextLine();
        System.out.print("Enter the third city: ");
        cityThree = input.nextLine();
        cityOneC = cityOne.toUpperCase();
        cityTwoC = cityTwo.toUpperCase();
        cityThreeC = cityThree.toUpperCase();
        
        for(int i = 0; i!=3;i++){
            if (cityOneC.charAt(0) < cityTwoC.charAt(0) && cityOneC.charAt(0) < cityThreeC.charAt(0)){
                one = cityOne;
            }else if(cityOneC.charAt(0) < cityTwoC.charAt(0) || cityOneC.charAt(0) < cityThreeC.charAt(0)){
                two = cityOne;
            }else{
                three = cityOne;
            }
            if (cityTwoC.charAt(0) < cityOneC.charAt(0) && cityTwoC.charAt(0) < cityThreeC.charAt(0)){
                one = cityTwo;
            }else if(cityTwoC.charAt(0) < cityOneC.charAt(0) || cityTwoC.charAt(0) < cityThreeC.charAt(0)){
                two = cityTwo;
            }else{
                three = cityTwo;
            }
            if (cityThreeC.charAt(0) < cityOneC.charAt(0) && cityThreeC.charAt(0) < cityTwoC.charAt(0)){
                one = cityThree;
            }else if(cityThreeC.charAt(0) < cityOneC.charAt(0) || cityThreeC.charAt(0) < cityTwoC.charAt(0)){
                two = cityThree;
            }else{
                three = cityThree;
            }
            
        }
        System.out.printf("The three cities in alphabetical order are %s %s %s",one,two,three);
    }
    
}
