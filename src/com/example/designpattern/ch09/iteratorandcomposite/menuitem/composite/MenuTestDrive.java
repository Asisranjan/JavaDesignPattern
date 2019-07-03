package com.example.designpattern.ch09.iteratorandcomposite.menuitem.composite;

import java.util.Iterator;

public class MenuTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuComponent panCakeHouseMenu = new Menu("Pan Cake House Menu", "BREAKFAST");
		MenuComponent dinnerMenu = new Menu("Dinner Menu", "Lunch");
		MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
		MenuComponent desertMenu = new Menu("Deset Menu", "Deset of Course!");
		
		MenuComponent allMenu = new Menu("ALL Menu", "All menu combined");
		allMenu.add(panCakeHouseMenu);
		allMenu.add(dinnerMenu);
		allMenu.add(cafeMenu);
		
		dinnerMenu.add(new MenuItem("Pasta", "Pasta", true, 8.99));
		dinnerMenu.add(new MenuItem("Egg Masala", "Indian Egg Masala", false, 5.99));
		dinnerMenu.add(desertMenu);
		
		desertMenu.add(new MenuItem("Apple Pie", "Apple Pie", true, 8.99));
		
		Waitress waitress = new Waitress(allMenu);
		
		waitress.print();
		testCompositeIterator(allMenu.createIterator());
		
		System.out.println("=====Vegeterian Menu=======");
		waitress.printVegeterianMenu();
	}
	
	public static void testCompositeIterator(Iterator it) {
		while (it.hasNext()) {
			MenuComponent mc = (MenuComponent) it.next();
			System.out.println(mc.getName());
			System.out.println(mc.getDescription());
			
		}
	}

}
