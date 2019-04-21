package com.example.designpattern.ch01.simuduck;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("<< silence >>");
	}

}
