package com.example.designpattern.ch09.iteratorandcomposite.menuitem.advanced;

import java.util.ArrayList;
import java.util.Iterator;

public class AdvancedWaitress {
	
	ArrayList menus;
	
	public AdvancedWaitress(ArrayList menus) {
		this.menus = menus;
	}
	
	public void printMenu() {	
		Iterator menuItr = menus.iterator();
		while (menuItr.hasNext()) {
			Menu menu = (Menu) menuItr.next();
			printMenu(menu.createIterator());
		}
	}
	
	public void printMenu(Iterator iter) {
		while(iter.hasNext()) {
			MenuItem menuItem = (MenuItem) iter.next();
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getDescription() + " ");
			System.out.println(menuItem.getPrice());
		}
	}
	
	public void printBreakfastMenu() {
		
	}
	
	public void printLunchMenu() {
		
	}
	
	public void printVegeterianMenu() {
		
	}
	
	public boolean isItemVegeterian(String name) {
		return false;
	}
}
