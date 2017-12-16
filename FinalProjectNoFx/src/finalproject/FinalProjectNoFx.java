/*
 * Zody Woolsey
 */
package finalproject;

import finalproject.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FinalProjectNoFx {
	
    public static void main(String[] args) {
    	internalStore S = new internalStore();
    	Scanner input = new Scanner(System.in);
    	file F = new file();
    	try {
    		S.items.addAll(F.read());
    	} catch (FileNotFoundException e) {
    		System.out.println("No existing database\nCreating new database.");
		}
    		
    	int choice = 0;
    	
    	while (true) {
    		input.reset();
    		choice = 0;
    		while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
    			System.out.println(" Please choose an operation\n Search (1)\n Add (2)\n Edit (3)\n Delete (4)");
    			try {
    				choice = input.nextInt();
    				if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
    					System.out.println("That was not one of the options.\n\n\n\n\n\n\n\n");
    				}
    			}catch (java.util.InputMismatchException ex) {
    				System.out.println("That was not a number, please only enter numbers.\n\n\n\n\n\n\n\n");
    				input.next();
    			}
    		}
    		
    		if (choice == 1) {
    			S.search();
    		}else if(choice == 2) {
    			S.add();
    		}else if(choice == 3) {
    			S.edit();
    		}else if(choice == 4) {
    			S.delete();
    		}
    		
    	}
    }
    
}
