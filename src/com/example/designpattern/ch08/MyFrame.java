package com.example.designpattern.ch08;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame(String string) {
		// TODO Auto-generated constructor stub
		super(string);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		String msg = "i rule";
		g.drawString(msg, 100, 100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame myFrame = new MyFrame("myframe");
	}


}
