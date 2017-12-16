package finalproject;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import finalproject.*;
import java.util.Scanner;

public class internalStore {
	
	protected ArrayList<Item> items = new ArrayList();
	protected Scanner input = new Scanner(System.in);
	protected file F = new file();
	public internalStore() {
		
	}
	public ArrayList<Item> search(){
		System.out.println("Please define you search phrase. (just hit enter to view all)");
		String crit = input.nextLine();
		ArrayList<Item> picked = new ArrayList();
		
		for (int i = 0; i < items.size(); i++) {
			if ( items.get(i).name.toLowerCase( ).contains(crit.toLowerCase( ) ) || items.get(i).id.toLowerCase( ).contains(crit.toLowerCase( ) ) ) {
				picked.add(items.get(i));
			}
		}
		
		picked = sort(picked);
		
		System.out.println(printList(picked));
		return picked;
	}
	public void add() {
		String id;
		String name;
		String stock;
		System.out.println("Please enter the ID.");
		id = input.nextLine();
		System.out.println("Please enter the name.");
		name = input.nextLine();
		System.out.println("Please enter the current stock of the product.");
		stock = input.nextLine();
		for (int i = 0; i < items.size(); i++) {
			if (id.equals(items.get(i).getID())) {
				System.out.printf("Sorry a product with that ID already exists: %s.", (String)(items.get(i).id+" "+items.get(i).name+" "+items.get(i).stock) );
			}
		}
		items.add(new Item(id, name, stock));
		
		
		try {
			F.write(printList(IDsort(items)));
		} catch (FileNotFoundException e) {
		}
		
		
	}
	
	public void edit() {
		int choice = 0;
		String crit = "";
		System.out.println("Please choose enter the ID of the item you would like to delete.");
		crit = input.nextLine();
		int ref = findRef(crit);
		input.reset();
		input.nextLine();
		if (choice == 1) {
			System.out.println("Please enter the new ID");
			items.get(ref).id = input.nextLine();
		}else if (choice == 2) {
			System.out.println("Please enter the new Name");
			items.get(ref).name = input.nextLine();
		}else if (choice == 3) {
			System.out.println("Please enter the new Stock");
			items.get(ref).stock = input.nextLine();
		}else {
			
		}
		try {
			F.write(printList(IDsort(items)));
		} catch (FileNotFoundException e) {
		}
	}
	
	public void delete() {
		int choice = 0;
		String crit = "";
		System.out.println("Please choose enter the ID of the item you would like to delete.");
		crit = input.nextLine();
		int ref = findRef(crit);
		while (choice != 1 && choice != 2) {
			choice = 0;
			input.reset();
			System.out.println("What would you like to change?\nID (1)\nCancel (2)");
			try {
				choice = input.nextInt();
			}catch (java.util.InputMismatchException ex) {
				System.out.println("Please only enter numbers.");
			}
		}
		input.reset();
		input.nextLine();
		if (choice == 1) {
			items.remove(ref);
		}else if (choice == 2) {
		}
		
		try {
			F.write(printList(IDsort(items)));
		} catch (FileNotFoundException e) {
		}
	}
	
	public int findRef(String crit) {
		int ref = -1;
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).id.contains(crit)) {
				System.out.println(printList(items.get(i)));
				ref = i;
				break;
			}
		}
		return ref;
	}
	
	public ArrayList<Item> sort(ArrayList<Item> ls){
		int choice = 0;
		
		while (choice != 1 && choice != 2 && choice != 3) {
			System.out.println("Please choose how the data will be sorted:\nBy Name (1)\nBy ID (2)\nDon't Sort (3)");
			try {
				choice = input.nextInt();
			}catch (java.util.InputMismatchException ex) {
				System.out.println("Please only input numbers.");
			}
			input.nextLine();
		}
		
		if (choice == 1) {
			ls = Nsort(ls);
		}else if (choice == 2) {
			ls = IDsort(ls);
		}else if (choice == 3) {}
		
		return ls;
	}
	
	public ArrayList<Item> Nsort(ArrayList<Item> ls){
		Item tmp;
		Item tmp1;
		
		for (int i = 1; i < ls.size(); i++) {
			for (int a = i; a > 0; a--) {
				if(ls.get(a).name.toLowerCase().charAt(0) < ls.get(a-1).name.toLowerCase().charAt(0)) {
					tmp = ls.get(a);
					ls.set(a, ls.get(a-1));
					ls.set(a-1, tmp);
				}else if(ls.get(a).name.toLowerCase().charAt(0) == ls.get(a-1).name.toLowerCase().charAt(0)) {
					if(ls.get(a).name.toLowerCase().charAt(1) < ls.get(a-1).name.toLowerCase().charAt(1)) {
						tmp = ls.get(a);
						ls.set(a, ls.get(a-1));
						ls.set(a-1, tmp);
					}else if(ls.get(a).name.toLowerCase().charAt(1) == ls.get(a-1).name.toLowerCase().charAt(1)) {
						if(ls.get(a).name.toLowerCase().charAt(2) < ls.get(a-1).name.toLowerCase().charAt(2)) {
							tmp = ls.get(a);
							ls.set(a, ls.get(a-1));
							ls.set(a-1, tmp);
						}
					}
				}
				
			}
		}
		
		
		return ls;
	}
	
	public ArrayList<Item> IDsort(ArrayList<Item> ls){
		Item tmp;
		Item tmp1;
		
		for (int i = 1; i < ls.size(); i++) {
			for (int a = i; a > 0; a--) {
				if(ls.get(a).id.toLowerCase().charAt(0) < ls.get(a-1).id.toLowerCase().charAt(0)) {
					tmp = ls.get(a);
					ls.set(a, ls.get(a-1));
					ls.set(a-1, tmp);
				}else if(ls.get(a).id.toLowerCase().charAt(0) == ls.get(a-1).id.toLowerCase().charAt(0)) {
					if(ls.get(a).id.toLowerCase().charAt(1) < ls.get(a-1).id.toLowerCase().charAt(1)) {
						tmp = ls.get(a);
						ls.set(a, ls.get(a-1));
						ls.set(a-1, tmp);
					}else if(ls.get(a).id.toLowerCase().charAt(1) == ls.get(a-1).id.toLowerCase().charAt(1)) {
						if(ls.get(a).id.toLowerCase().charAt(2) < ls.get(a-1).id.toLowerCase().charAt(2)) {
							tmp = ls.get(a);
							ls.set(a, ls.get(a-1));
							ls.set(a-1, tmp);
						}
					}
				}
				
			}
		}
		
		return ls;
	}
	
	public String printList(ArrayList<Item> ls) {
		String printable = "";
		for (int i = 0; i < ls.size(); i++) {
			printable += (String)(ls.get(i).id+" "+ls.get(i).name+" "+ls.get(i).stock+"\n");
		}
		return printable;
	}public String printList(Item ls) {
		return (String)(ls.id+" "+ls.name+" "+ls.stock);
	}
}
