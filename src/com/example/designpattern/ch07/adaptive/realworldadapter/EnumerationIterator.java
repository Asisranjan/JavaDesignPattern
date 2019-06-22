package com.example.designpattern.ch07.adaptive.realworldadapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator<E> implements Iterator<E> {

	Enumeration<E> e;
	public EnumerationIterator(Enumeration<E> e) {
		this.e = e;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return e.hasMoreElements();
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return e.nextElement();
	}

}
