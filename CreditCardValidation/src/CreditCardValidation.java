/**
 *
 * @author Zody
 */

import java.util.Scanner;

public class CreditCardValidation {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a card number.");
        long card = input.nextLong();
        int len;
        String type;
        int condition;
        
        while(true){
            condition = 0;
            len = cardLength(card);
            type = cardType(card);
            condition = cardVerif(card);
            
            if (condition == 0){
                System.out.printf("Card number length: %d \nCard type: %s \nYour card has been successfully verified. \n\nThank you for your purchase.", len,type);
                break;
            }else if(condition ==1){
                System.out.printf("Sorry that is not a valid card number. \nPlease try again.");
                System.out.println("Please input a card number.");
                card = input.nextLong();
            }else if (condition == 2){
                if (len > 16){
                    System.out.printf("Sorry your input of %d was too long. \nPlease try again.", card);
                }else if (len < 13){
                    System.out.printf("Sorry your input of %d was too short. \nPlease try again.", card);
                }
                System.out.println("Please input a card number.");
                card = input.nextLong();
            }else if (condition == 3){
                System.out.printf("Sorry that is not a valid card type. \nWe only accept the following: \nAmerican Express \nVisa \nMaster Card \nDiscover Card\n\n");
                System.out.println("Please input a card number.");
                card = input.nextLong();
            }
        }
    }
    
    public static int cardLength(long cNum){
        int len = 1;
        long temp = cNum;
        
        while(true){
            temp /= 10;
            if (temp == 0){
                break;
            }
            len+=1;
        }
        return len;
    }
    
    public static String cardType(long cNum){
        String type = "Not Valid";
        int length = cardLength(cNum);
        long temp = cNum;
        
        for (int i = length; i > 0; i--){
            temp /= 10;
            if (temp == 37){
                type = "American Express";
                break;
            }else if (temp == 4){
                type = "Visa";
                break;
            }else if (temp == 5){
                type = "Master Card";
                break;
            }else if (temp == 6){
                type = "Discover Card";
                break;
            }
        }
        return type;
    }
    
    public static int cardVerif(long cNum){
        int condition;
        condition = 0;
        String type = cardType(cNum);
        int len = cardLength(cNum);
        
        if (type.contentEquals("Not Valid")){
            condition = 3;
        }
        if (!(len >= 13 && len <= 16)){
            condition = 2;
        }
        if (cardAlg(cNum) == false){
            condition = 1;
        }
        return condition;
    }
    
    public static boolean cardAlg(long cNum){
        boolean alg = false;
        long itemp;
        int length = cardLength(cNum);
        int odd = 0;
        int even = 0;
        
        for (int i = 0; i < length; i++){
            
            if (((i+1)%2) == 0){
                itemp = cNum%10;
                itemp *= 2;
                if (itemp >= 10){
                    itemp = (itemp-10)+1;
                }
                even += itemp;
            }else{// adds odd variable to calculate that.
                odd += cNum%10;
            }
            cNum /= 10;
        }
        
        if((odd+even)%10 == 0){
            alg = true;
        }

        return alg;
    }
    
}
