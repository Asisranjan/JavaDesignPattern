package com.example.designpattern.ch07.adaptive.realworldadapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter<E> implements Enumeration<E> {
	Iterator<E> i;
	
	public IteratorAdapter(Iterator<E> i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}
	
	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return i.hasNext();
	}

	@Override
	public E nextElement() {
		// TODO Auto-generated method stub
		return i.next();
	}

}
