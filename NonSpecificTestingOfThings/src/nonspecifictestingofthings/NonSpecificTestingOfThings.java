/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonspecifictestingofthings;

/**
 *
 * @author zodywoolsey
 */
public class NonSpecificTestingOfThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a;
        double b = 0;
        double c = 0;
        a = 100.123456789;
        System.out.println(a +" "+ b +" "+ c);
        b = a*100;
        System.out.println(a +" "+ b +" "+ c);
        b = (int)b;
        System.out.println(a +" "+ b +" "+ c);
        c = (double)(b/100);
        System.out.println(a +" "+ b +" "+ c);
        
    }
    
}
