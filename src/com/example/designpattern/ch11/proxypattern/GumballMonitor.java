package com.example.designpattern.ch11.proxypattern;

import java.rmi.RemoteException;

public class GumballMonitor {

	GumballMachineRemote gm;
	
	public GumballMonitor(GumballMachineRemote gmr) {
		this.gm = gmr;
	}
	
	public void printReport() {
		try {
			System.out.println("count: "+gm.getCount());

			System.out.println("state: "+gm.getState());
			System.out.println("location: "+gm.getLocation());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
