package com.example.designpattern.ch09.iteratorandcomposite.menuitem;

import java.util.ArrayList;

public class Waitress {
	
	PanCakeHouseMenu panCakeHouseMenu;
	DinnerMenu dinnerMenu = new DinnerMenu();
	
	public Waitress(PanCakeHouseMenu panCakeHouseMenu, DinnerMenu dinnerMenu) {
		this.panCakeHouseMenu =panCakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	public void printMenu() {		
		ArrayList pchMenuItems = panCakeHouseMenu.getMenuItems();
		MenuItem[] dinnerMenuItems = dinnerMenu.getMenuItems();
		
		for (int i = 0; i < pchMenuItems.size(); i++) {
			MenuItem menuItem = (MenuItem) pchMenuItems.get(i);
			
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getDescription() + " ");
			System.out.println(menuItem.getPrice());
		}
		
		for (int i = 0; i < dinnerMenuItems.length; i++) {
			MenuItem menuItem = dinnerMenuItems[i];
			
			if (menuItem != null) {
				System.out.println(menuItem.getName() + " ");
				System.out.println(menuItem.getDescription() + " ");
				System.out.println(menuItem.getPrice());
			}
		}
		
		System.out.println("=======================");
		System.out.println("using iterator pattern");
		System.out.println("=======================");
		
		printMenu(panCakeHouseMenu.createIterator());
		printMenu(dinnerMenu.createIterator());
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
