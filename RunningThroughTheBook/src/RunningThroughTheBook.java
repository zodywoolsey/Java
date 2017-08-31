/**
 *
 * @author zodywoolsey
 */
import java.util.Scanner;

public class RunningThroughTheBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loopNum;
        int randMax;
        int randMin;
        System.out.println("How many random numbers do you want to generate?: ");
        loopNum = input.nextInt();
        System.out.println("What is the highest number to be generated?: ");
        randMax = input.nextInt();
        System.out.println("What is the lowest number to be generated?: ");
        randMin = input.nextInt();
        randNums(loopNum, randMax,randMin);
    }
    public static void randNums(int loopNum, int randMax, int randMin){
        int num;
        //int i;
        //int loopNum;
        for(int i=0; i<loopNum; i++){
        num = (int)(randMin+Math.random()*randMax);
        System.out.println(num);
        }
    }
    
}
