package com.example.designpattern.ch12.mvc;

public class HeartTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeartModel model = new HeartModel();
		ControllerInterface controller = new HeartController(model);
	}

}
