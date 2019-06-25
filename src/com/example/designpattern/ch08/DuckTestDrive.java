package com.example.designpattern.ch08;

import java.util.Arrays;

public class DuckTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck []ducks = new Duck[] {new Duck("Daffy", 8),
				new Duck("Dewey", 2),
				new Duck("Howard", 7),
				new Duck("Louie", 2),
				new Duck("Donald", 10),
				new Duck("Huey", 2)};
		
		System.out.println("Before Sorting..");
		display(ducks);
		
		Arrays.sort(ducks);
		
		System.out.println("After Sorting..");
		display(ducks);
	}

	private static void display(Duck[] ducks) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}

}
