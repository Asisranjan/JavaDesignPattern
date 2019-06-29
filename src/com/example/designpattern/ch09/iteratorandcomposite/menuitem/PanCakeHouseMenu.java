package com.example.designpattern.ch09.iteratorandcomposite.menuitem;

import java.util.ArrayList;

public class PanCakeHouseMenu {
	ArrayList menuItems;
	
	public PanCakeHouseMenu() {
		// TODO Auto-generated constructor stub
		menuItems = new ArrayList<>();
		
		addMenuItem("K&B's Pancake Breakfast", "Pancake with Scrambled eggs and toast", 2.99, false);
		addMenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs and sausage", 2.99, false);
		addMenuItem("Blueberry Pancakes", "Pancake made with fresh blueberries", 3.49, true);
		addMenuItem("Waffles", "Waffles, with your choice of blueberries or strawberies", 3.59, true);
	}
	
	public void addMenuItem(String name, String description, double price, boolean vegeterian) {
		MenuItem menuItem = new MenuItem(name, description, price, vegeterian);
		menuItems.add(menuItem);
	}

	public ArrayList getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator() {
		return new PanCakeHouseIterator(menuItems);
	}
}
