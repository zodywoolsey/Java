import java.util.Scanner;

public class Mode{
    
    public static void main(String[] args){
        
        String name;
        int anotherNum;
        int evenOrOdd;
        
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name.");
        name = input.nextLine();
        
        System.out.println("Please enter an integer.");
        anotherNum = input.nextInt();
        
        evenOrOdd = anotherNum%2;
        
        boolean isEven = (evenOrOdd == 0);
        
        System.out.println("You entered " + name);
        System.out.println(evenOrOdd + " is " + isEven + " even.");
        
    }
}