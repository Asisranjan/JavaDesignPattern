package com.example.designpattern.ch08.codeupclose;

public abstract class AbstractClass {
	final void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		concreteOperation();
		hook();
	}

	void hook() {
		// TODO Auto-generated method stub
		
	}

	final void concreteOperation() {
		// TODO Auto-generated method stub
		
	}

	protected abstract void primitiveOperation2();

	protected abstract void primitiveOperation1();
}
