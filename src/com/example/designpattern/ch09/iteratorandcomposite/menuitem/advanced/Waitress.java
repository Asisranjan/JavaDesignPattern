package com.example.designpattern.ch09.iteratorandcomposite.menuitem.advanced;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	
	Menu panCakeHouseMenu;
	Menu dinnerMenu;
	Menu cafeMenu;
	
	public Waitress(Menu panCakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
		this.panCakeHouseMenu =panCakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu() {		
		System.out.println("==BREAKFAST==");
		printMenu(panCakeHouseMenu.createIterator());
		System.out.println("==LUNCH==");
		printMenu(dinnerMenu.createIterator());
		System.out.println("==CAFE MENU==");
		printMenu(cafeMenu.createIterator());
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
