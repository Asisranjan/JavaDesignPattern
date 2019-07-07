package com.example.designpattern.ch11.rmi;

import java.rmi.Naming;

public class RemoteService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
		}
		catch(Exception e) {
			System.out.println("Got exception while registering service to rmi registry");
			e.printStackTrace();
		}
	}

}
