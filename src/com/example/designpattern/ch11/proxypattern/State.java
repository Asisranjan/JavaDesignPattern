package com.example.designpattern.ch11.proxypattern;

import java.io.Serializable;

public interface State extends Serializable{
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
}
