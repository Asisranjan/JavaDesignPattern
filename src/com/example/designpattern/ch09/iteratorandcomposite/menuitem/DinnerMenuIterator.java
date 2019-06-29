package com.example.designpattern.ch09.iteratorandcomposite.menuitem;

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

}
