package com.example.designpattern.ch09.iteratorandcomposite.menuitem.advanced;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
	MenuItem[] menuItems;
	int pos = 0;
	
	public DinnerMenuIterator(MenuItem[] menuItems) {
		// TODO Auto-generated constructor stub
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (pos >= menuItems.length || menuItems[pos] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return menuItems[pos++];
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		if (pos <= 0) {
			throw new IllegalArgumentException();
		}
		
		if (menuItems[pos - 1] != null) {
			for (int i = pos -1; i < menuItems.length -1; i++) {
				menuItems[i] = menuItems[i+1];
			}
			menuItems[menuItems.length - 1] = null;
		}
	}
	
	
}
