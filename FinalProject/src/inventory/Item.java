/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;



/**
 *
 * @author Zody
 */
public class Item {
    protected int id;
    protected String name;
    protected int stock;
    public Item(int id, String name, int stock){
        this.id = id;
        this.name = name;
        this.stock = stock;
    }
}
