package com.example.designpattern.ch09.iteratorandcomposite.menuitem.advanced;

import java.util.ArrayList;
import java.util.Iterator;

public class DinnerMenu implements Menu{
	int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		// TODO Auto-generated constructor stub
		menuItems = new MenuItem[MAX_ITEMS];
		
		addMenuItem("Vegeterian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", 2.99, true);
		addMenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", 2.99, false);
		addMenuItem("Soup of the day", "Soup of the day, with a side of potato salad", 3.29, false);
		addMenuItem("Hotdog", "A Hot dog, with saukraut relish, onions, topped with cheese", 3.05, false);
	}
	
	public void addMenuItem(String name, String description, double price, boolean vegeterian) {
		MenuItem menuItem = new MenuItem(name, description, price, vegeterian);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, menu is full, can't add item to menu");
		}
		else {
			menuItems[numberOfItems++] = menuItem;
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	
	@Override
	public Iterator createIterator() {
		return new DinnerMenuIterator(menuItems);
	}

}
