
import java.util.Scanner;

public class GameZoneQuizQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String currentAns;
        String[] questions = {"1. What color is an apple?\nA: red\nB: grey\nC: purple\n","2. 2+2\nA: 5\nB: 4\nC: 1/4","3. What is larger?\nA: Moon\nB: Earth\nC: Literally Everything\n","4. Which of these is not an integer?\nA: 4\nB: Five\nC: 975\n", "5. 3+1\nA: 4\nB: 2\nC: 7"};
        String[] answers = {"A","B","C","B","A","B","C","B","A","C"};
        
        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            currentAns = input.next();
            if (currentAns.charAt(0) == answers[i].charAt(0)){
                System.out.println("Correct!");
            }else{
                System.out.println("Wrong. The correct answer was " + answers[i]);
            }
        }
        
    }
}
