package com.example.designpattern.ch09.iteratorandcomposite.menuitem.advanced;

import java.util.ArrayList;
import java.util.Iterator;

public class PanCakeHouseMenu implements Menu{
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
	
	@Override
	public Iterator createIterator() {
		return menuItems.iterator();
	}
}
