package finalproject;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import finalproject.Item; import finalproject.internalStore;

public class file{
	protected File file;
	protected PrintWriter print;
	
	public file() {
		file = new File("inv.txt");
	}
	
	public void write(String ls) throws java.io.FileNotFoundException{
		print = new PrintWriter(file);
		print.write(ls);
	}
	
	public ArrayList<Item> read() throws java.io.FileNotFoundException{
		Scanner read = new Scanner(file);
		String id = "";
		String name = "";
		String stock = "";
		int count = 0;
		ArrayList<Item> items = new ArrayList();
		while (read.hasNextLine()) {
			for (int i = 0; i < 3; i++) {
				id = read.next();
				name = read.next();
				stock = read.next();
			}
			items.add(new Item(id,name,stock));
			count++;
		}
		return items;
	}
}