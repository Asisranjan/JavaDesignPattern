package com.example.designpattern.ch09.iteratorandcomposite.menuitem.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	ArrayList menuComponents = new ArrayList();
	String name;
	String description;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		menuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		// TODO Auto-generated method stub
		return (MenuComponent) menuComponents.get(i);
	}

	public ArrayList getMenuComponents() {
		return menuComponents;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(name);
		System.out.println(", " + description);
		System.out.println("------------------------");
		Iterator it = menuComponents.iterator();
		
		while (it.hasNext()) {
			MenuComponent m = (MenuComponent) it.next();
			m.print();
		}
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new CompositeIterator(menuComponents.iterator());
	}
	
	
}
