package com.example.designpattern.ch11.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RemoteClientTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("begin");
			MyRemote service = (MyRemote)Naming.lookup("rmi://127.0.0.1/RemoteHello");
			System.out.println(service);
			String s = service.sayHello();
			System.out.println(s);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
