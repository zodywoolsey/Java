/**
 *
 * @author zodywoolsey
 * The commented out sections are little bits of testing I used to perfect the math. I think there is still some inaccuracy but it seems java actually has some issues with large ints.
 */

import java.util.Scanner;

public class Palindrome {
    //Created multiple static variables so they could be reference within different modules in this file
static int isPalin;
static double temp;
static double revNum;

    public static void main(String[] args) {//main class doesn't do much but its the main so whatever.
        
        //just the variable for cleaner final output
        String yORn;
        int choice;
        
        //creates input object with scanner
        Scanner input = new Scanner(System.in);
        
        //get input for the number choice
        System.out.println("Please Choose a number to see if it is a Palindrome!");
        choice = input.nextInt();
        
        //this if/else is just here so that the final output can look cleaner
        if (isPalindrome(choice) == 1){
            yORn = "";
        }else{
            yORn = "not ";
        }
        
        //this conjucts all of this nightmare together into one simple sentence to make it look like a piece of cake *wink*
        System.out.println("You chose: " + choice + " this reversed is " + reverse(choice) + " and this number is " + yORn + "a palindrome.");
    }
    public static int reverse(int num){//this reverses the number
        //these are for loops and counters
        int i = 1;
        int c = 0;
        
        //these are for breaking up the math operations because they are super faulty for some reason
        double pow;
        double help;
        double alsoTemp;
        
        //this while counts the number of digits in the chosen number so that the length can be used later
        while(true){
            //pulls numbers off of the chosen number as i is multiplied by 10 to move full digits through the chosen number and then sets it equal to temp
            temp = num%(i);
//            System.out.println(temp + " <--temp || num--> " + num);//testing
            if (temp == num){//checks to see if the two numbers are equal and breaks if they are.
                break;
            }
            //multiplies i by 10 each time to make sure mod steps through the chosen number by full digits
            i*= 10;
            c+=1;//counter for number of digits in the chosen number
        }
        //set these to 0 so they can be reused instead of creating new variables
        temp = 0;
        revNum = 0;//just to help the math weirdness
        for (i=0; i < c; i++){//this for loop steps through the chosen number and then does some math magic to reverse the number
            help = (num%10);//pulls last number
            alsoTemp = help/10;//places the number in a floating decimal space so that it can be mathematically formatted
            revNum += alsoTemp;//adds the mathematically formatted number to the reversed number variable
            revNum *= 10;//multiplies it by 10 to make it able to be successfully converted to an int
            num/=10;//truncates the end number
//            System.out.println("this is the flip " + temp + " <--temp || num--> " + num + "revNum-->" + revNum);//testing
        }
//        System.out.println("rev is " + revNum);
        return (int)revNum;//returns int casted reversed number variable
    }
    public static int isPalindrome(int num){
        if (num == reverse(num)){//super simple if statement to see if the number is a palindrome
            return 1;
        }else{
            return 0;
        }
        
    }
}
