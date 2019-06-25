package com.example.designpattern.ch08.barista;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffineBeverageWithHook{
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("add sugar and milk");
	}

	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("brew coffee grind");
	}

	@Override
	boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		String answer = getUserInput();
		if ("y".equalsIgnoreCase(answer)) {
			return true;
		}
		return false;
	}

	private String getUserInput() {
		// TODO Auto-generated method stub
		String answer = null;
		
		System.out.println("Would you like to add condiments in your cofee...enter (y/n)?	");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = br.readLine();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		if (answer == null) {
			answer = "no";
		}
		return answer;
	}
	
	
}
