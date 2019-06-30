package com.example.designpattern.ch09.iteratorandcomposite.menuitem.advanced;

import com.example.designpattern.ch09.iteratorandcomposite.menuitem.advanced.anothermerger.CafeMenu;

public class MenuTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PanCakeHouseMenu panCakeHouseMenu = new PanCakeHouseMenu();
		DinnerMenu dinnerMenu = new DinnerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		Waitress waitress = new Waitress(panCakeHouseMenu, dinnerMenu, cafeMenu);
		waitress.printMenu();
	}

}
