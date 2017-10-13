

import java.util.Scanner;
import java.util.Random;

public class HangMan {
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        
        String chosenWord = " ";
        String currentChoice = "";
        String[] words = {"hello","cat","dog","pig"};
        
        chosenWord = pickWord(words);
        
        while(currentChoice.contentEquals(chosenWord) != true){
        System.out.println("Please guess a word that is " + chosenWord.length() + " letters long.");
        currentChoice = input.next();
        
        System.out.println(ansCheck(currentChoice, chosenWord));
        }
    }//______________________________________________________________________________________________________
    public static String pickWord(String[] words){
        return words[rand.nextInt(words.length)];
    }//______________________________________________________________________________________________________
    public static char[] ansCheck(String choice, String word){
        char[] check = new char[word.length()];
        if ( word.length() > choice.length()){
            choice += "      ";
        }
        for (int i = 0; i < word.length(); i++){
            if (choice.charAt(i) == word.charAt(i)){
                check[i] = choice.charAt(i);
            }else{
                check[i] = '|';
            }
            
        }
        return check;
    }//______________________________________________________________________________________________________
    public static char[] easyAnsCheck(String choice, String word){
        char[] check = new char[word.length()];
        if (word.length() > choice.length()){
            for(int i = (word.length()-choice.length()); i > 0; i--){
                choice += " ";
            }
        }
        for (int i = 0; i < word.length(); i++){
            for(int a = 0; a < word.length(); a++){
                if (word.charAt(i) == choice.charAt(a)){
                    check[i] = word.charAt(i);
                    break;
                }else if(word.charAt(i) != choice.charAt(a)){
                    check[i] = '_';
                }
            }
        }
        
        return check;
    }
    
}
