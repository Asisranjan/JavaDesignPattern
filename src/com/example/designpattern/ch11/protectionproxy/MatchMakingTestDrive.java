package com.example.designpattern.ch11.protectionproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {
	HashMap<String, PersonBean> datingDB = new HashMap<>();
	
	public MatchMakingTestDrive() {
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		PersonBean p1 = new PersonBeanImpl();
		p1.setName("Joe");
		p1.setInterests("Computer, Cars, Music");
		p1.setHotOrNotRating(7);
		
		datingDB.put(p1.getName(), p1);
		
		PersonBean p2 = new PersonBeanImpl();
		p2.setName("Kelly");
		p2.setInterests("amazon, movies, dance");
		p2.setHotOrNotRating(6);
		
		datingDB.put(p2.getName(), p2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatchMakingTestDrive m = new MatchMakingTestDrive();
		m.drive();

	}
	
	private void drive() {
		// TODO Auto-generated method stub
		PersonBean joe = getPersonFromDb("Joe");
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("bowling, go");
		System.out.println("Interests set from owner proxy");
		
		try {
			ownerProxy.setHotOrNotRating(10);
		}
		catch(Exception e) {
			System.out.println("can't set ratings from owner proxy");
		}
		
		System.out.println("Rating is "+ ownerProxy.getHotOrNotRating());
		
		System.out.println("===============================================");
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		
		try {
			nonOwnerProxy.setInterests("bowling, go");
		}
		catch(Exception e) {
			System.out.println("can't set interests from non owner proxy");
		}

		nonOwnerProxy.setHotOrNotRating(10);
		System.out.println("Rating is "+ nonOwnerProxy.getHotOrNotRating());
		
	}

	private PersonBean getPersonFromDb(String name) {
		// TODO Auto-generated method stub
		return datingDB.get(name);
	}

	PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
	}
	
	PersonBean getNonOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
	}
	
	PersonBean getProxy(InvocationHandler invocationHandler, PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
	}

}
