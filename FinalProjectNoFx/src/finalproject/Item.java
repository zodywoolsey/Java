/*
 * Zody Woolsey
 */
package finalproject;

import java.util.ArrayList;
import finalproject.*;

public class Item {
    protected String id;
    protected String name;
    protected String stock;
    private int numItems;
    
    public Item(String id, String name, String stock){
    	numItems += 1;
        this.id = id;
        this.name = name;
        this.stock = stock;
    }
    public String getID() {
    	return this.id;
    }
    public void setID(String id) {
    	this.id = id;
    }
    public String getNAME() {
    	return this.name;
    }
    public void setNAME(String name) {
    	this.name = name;
    }
    public String getSTOCK() {
    	return this.stock;
    }
    public void setSTOCK(String stock) {
    	this.stock = stock;
    }
    public String getALL() {
    	String ls = getID()+getNAME()+getSTOCK();
    	return ls;
    }
    public int getNumItems() {
    	return numItems;
    }
}
