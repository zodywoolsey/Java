/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deleteme;

/**
 *
 * @author zodywoolsey
 */

import java.util.Scanner;

public class Deleteme {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        num = num%10;
        System.out.println(num);
    }
    
}
