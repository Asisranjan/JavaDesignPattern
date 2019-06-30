package com.example.designpattern.ch09.iteratorandcomposite.menuitem.advanced.anothermerger;

import java.util.Hashtable;
import java.util.Iterator;

import com.example.designpattern.ch09.iteratorandcomposite.menuitem.advanced.Menu;
import com.example.designpattern.ch09.iteratorandcomposite.menuitem.advanced.MenuItem;

public class CafeMenu implements Menu{
	Hashtable menuItems = new Hashtable();
	
	public CafeMenu() {
		// TODO Auto-generated constructor stub
		addMenuItem("Veggie Burger and Air Fries", "Veggies Burger on a whole wheat bun", 3.99, true);
		addMenuItem("Soup of the day", "A cup of the soup of the day, with a side of salad", 3.69, false);
		addMenuItem("Burrito", "A large burrito with whole pinto beans, salsa, guacamole", 4.29, true);
	}
	
	public void addMenuItem(String name, String description, double price, boolean vegeterian) {
		MenuItem menuItem = new MenuItem(name, description, price, vegeterian);
		menuItems.put(menuItem.getName(), menuItem);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return menuItems.values().iterator();
	}
}
