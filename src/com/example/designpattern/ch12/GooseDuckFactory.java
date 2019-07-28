package com.example.designpattern.ch12;

public class GooseDuckFactory extends AbstractGooseFactory {

	@Override
	public Quackable createGooseDuck() {
		// TODO Auto-generated method stub
		return new GooseAdapter(new Goose());
	}

}
