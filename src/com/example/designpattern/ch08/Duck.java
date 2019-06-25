package com.example.designpattern.ch08;

public class Duck implements Comparable{
	String name;
	int age;
	
	public Duck(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Duck otherDuck = (Duck) arg0;
		if (this.age < otherDuck.age) {
			return -1;
		}
		else if (this.age > otherDuck.age) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", age=" + age + "]";
	}
	
	
}
