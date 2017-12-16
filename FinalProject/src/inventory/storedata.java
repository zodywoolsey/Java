/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.io.File;
import inventory.Item;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Zody
 */
public class storedata {
    private ArrayList<Item> items = new ArrayList<Item>();
    private File inv = new File("Inventory.txt");
    public storedata(){
        items.add(new Item(001, "banana", 5));
        
        try{
            placeData(items);
        }catch (java.io.IOException ex){
            System.out.println("didNotCreate");
        }
        try{
            Scanner inF = new Scanner(inv);
            System.out.println(inF.next());
        }catch (FileNotFoundException noFile){
            System.out.println("broke");
        }
//        if (inv.exists() == true){
//            items = getData();
//        }else if (inv.exists() == false){
//            
//        }
    }
//    protected ArrayList getData(){
//        ArrayList<Item> invList = new ArrayList<Item>();
//        try{
//            Scanner inF = new Scanner(new File("Inventory.txt"));
//        }catch (FileNotFoundException noFile){
//            
//        }
//        
//        
//        return invList;
//    }
    
    public void placeData(ArrayList<Item> items) throws java.io.IOException{
        PrintWriter write = new PrintWriter(inv);
        write.print(items);
    }
    
}
