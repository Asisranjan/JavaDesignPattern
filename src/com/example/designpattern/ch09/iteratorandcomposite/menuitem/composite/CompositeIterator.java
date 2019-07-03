package com.example.designpattern.ch09.iteratorandcomposite.menuitem.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	Stack stack = new Stack();
	public CompositeIterator(Iterator it) {
		stack.push(it);
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (stack.isEmpty()) {
			return false;
		}
		
		Iterator it = (Iterator) stack.peek();
		if (!it.hasNext()) {
			stack.pop();
			return hasNext();
		}
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if (hasNext()) {
			Iterator it = (Iterator) stack.peek();
			MenuComponent mc = (MenuComponent) it.next();
			if (mc instanceof Menu) {
				stack.push(mc.createIterator());
			}
			return mc;
		}
		return null;
	}

}
