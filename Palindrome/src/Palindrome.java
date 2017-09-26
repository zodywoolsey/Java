/**
 *
 * @author zodywoolsey
 */

import java.util.Scanner;

public class Palindrome {
static int isPalin;
static double temp;
static double revNum;
static int choice;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Choose a number to see if it is a Palindrome!");
        choice = input.nextInt();
        System.out.println(reverse(choice) + " || " + choice + " is Palin?--> " + isPalindrome(reverse(choice)));
    }
    public static int reverse(int num){
        int i = 1;
        int c = 0;
        int altNum=num;
        double pow;
        double help;
        double alsoTemp;
        while(true){
            temp = num%(i);
//            System.out.println(temp + " <--temp || num--> " + num);
            if (temp == num){
                break;
            }
            i*= 10;
            c+=1;
        }
        temp = 0;
        revNum = 0;
        for (i=0; i < c; i++){
//            pow = Math.pow(10, i);
            help = (altNum%10);
            alsoTemp = help/10;
//            alsoTemp *= pow;
//            alsoTemp /= pow;
            temp += alsoTemp;
            temp *= 10;
            altNum/=10;
//            System.out.println("this is the flip " + temp + " <--temp || altnum--> " + altNum + "revNum-->" + revNum);
        }
        revNum=temp;
//        System.out.println("rev is " + revNum);
        return (int)revNum;
    }
    public static int isPalindrome(int num){
        if (num == choice){
            return 1;
        }else{
            return 0;    
        }
        
    }
}
