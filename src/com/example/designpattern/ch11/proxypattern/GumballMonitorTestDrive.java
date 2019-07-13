package com.example.designpattern.ch11.proxypattern;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			GumballMachineRemote gm = (GumballMachineRemote)Naming.lookup("rmi://127.0.0.1/gumballMachine");
			GumballMonitor gmr = new GumballMonitor(gm);
			gmr.printReport();
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
