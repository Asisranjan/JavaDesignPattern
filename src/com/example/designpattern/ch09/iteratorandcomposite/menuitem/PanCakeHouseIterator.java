package com.example.designpattern.ch09.iteratorandcomposite.menuitem;

import java.util.ArrayList;

public class PanCakeHouseIterator implements Iterator {
	ArrayList menuItems;
	int index = 0;
	
	public PanCakeHouseIterator(ArrayList menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index < menuItems.size();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return menuItems.get(index++);
	}

}
