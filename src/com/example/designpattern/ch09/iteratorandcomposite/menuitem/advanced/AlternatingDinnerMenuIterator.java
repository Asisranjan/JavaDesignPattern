package com.example.designpattern.ch09.iteratorandcomposite.menuitem.advanced;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinnerMenuIterator implements Iterator {
	MenuItem[] items;
	int position;
	
	public AlternatingDinnerMenuIterator(MenuItem[] items) {
		this.items = items;
		Calendar calender = Calendar.getInstance();
		position =  calender.DAY_OF_WEEK % 2;
	}
	
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (position >= items.length || items[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem item = items[position];
		position += 2;
		return item;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("AlternatingDinnerMenuIterator does not support remove");
	}

}
