package com.example.designpattern.ch09.iteratorandcomposite.menuitem;

public class MenuTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PanCakeHouseMenu panCakeHouseMenu = new PanCakeHouseMenu();
		DinnerMenu dinnerMenu = new DinnerMenu();
		Waitress waitress = new Waitress(panCakeHouseMenu, dinnerMenu);
		waitress.printMenu();
	}

}
