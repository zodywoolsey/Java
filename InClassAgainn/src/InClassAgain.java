
import java.util.Scanner;

public class InClassAgain {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        printAgeAndName(getName(),getAge());
    }
    public static String getName(){
        String userName;
        System.out.println("Please type your name. ");
        userName = input.nextLine();
        return userName;
    }
    public static void printName(String name){
        System.out.println("So your name is " + name + ", cool.");
    }
    public static int getAge(){
        int age;
        System.out.println("Please enter your age. ");
        age = input.nextInt();
        return age;
    }
    public static void printAgeAndName(String name, int age){
        System.out.println("Your name is " + name + " and you are " + age + ".");
    }
}
