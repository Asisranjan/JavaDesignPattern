package com.example.designpattern.ch07.adaptive.realworldadapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class IteratorAdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Iterator<Integer> i = list.iterator();
		Enumeration<Integer> e = new IteratorAdapter<Integer>(i);
		
		printUsingEnumeration(e);
	}
	
	public static <E> void printUsingEnumeration(Enumeration<E> e) {
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
