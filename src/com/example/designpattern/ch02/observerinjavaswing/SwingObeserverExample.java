package com.example.designpattern.ch02.observerinjavaswing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObeserverExample {
	JFrame jFrame;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingObeserverExample().go();
	}

	private void go() {
		// TODO Auto-generated method stub
		jFrame = new JFrame();
		
		JButton jButton = new JButton("Should I do It?");
		jButton.addActionListener(new AngelListener());
		jButton.addActionListener(new DevilListener());
		jFrame.getContentPane().add(BorderLayout.CENTER, jButton);	
		jFrame.setSize(300, 300);
		jFrame.setVisible(true);
	}

}
