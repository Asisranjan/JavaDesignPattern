package com.example.designpattern.ch09.iteratorandcomposite.menuitem.composite;

import java.util.Iterator;

public class Waitress {
	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void print() {
		allMenus.print();
	}
	
	public void printVegeterianMenu() {
		Iterator it = allMenus.createIterator();
		while(it.hasNext()) {
			MenuComponent mc = (MenuComponent) it.next();
			try {
				if (mc.isVegeterian()) {
					mc.print();
				}
			}
			catch(UnsupportedOperationException e) {
				// ignore
			}
		}
	}
}

