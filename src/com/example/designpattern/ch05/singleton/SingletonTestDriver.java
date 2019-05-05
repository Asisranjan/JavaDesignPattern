package com.example.designpattern.ch05.singleton;

public class SingletonTestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println(instance1);
		System.out.println(instance2);
	}

}
