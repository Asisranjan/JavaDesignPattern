package com.example.designpattern.ch12;

public abstract class AbstractDuckFactory {
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createRubberDuck();
	public abstract Quackable createDuckCall();
}
