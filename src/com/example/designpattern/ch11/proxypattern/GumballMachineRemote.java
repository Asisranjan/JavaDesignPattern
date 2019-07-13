package com.example.designpattern.ch11.proxypattern;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote{
	int getCount() throws RemoteException;
	State getState()  throws RemoteException;
	String getLocation()  throws RemoteException;
}
