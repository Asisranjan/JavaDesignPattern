package com.example.designpattern.ch08;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
	String message;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		message = "Hello world, init";
		repaint();
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		message = "I am starting up";
		repaint();
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		message = "I am being stopped";
		repaint();
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString(message, 5, 15);
	}
}
