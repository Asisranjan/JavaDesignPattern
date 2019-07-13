package com.example.designpattern.ch11.virtualproxy;

import java.awt.BorderLayout;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.example.designpattern.ch02.observerinjavaswing.AngelListener;
import com.example.designpattern.ch02.observerinjavaswing.DevilListener;

public class ImageProxyTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			JFrame jFrame = new JFrame();
			Icon icon = new ImageProxy(new URL("https://upload.wikimedia.org/wikipedia/commons/7/7a/Mahatma-Gandhi%2C_studio%2C_1931.jpg"));
			ImageComponent imageComponent = new ImageComponent(icon);
			jFrame.getContentPane().add(imageComponent);
			jFrame.setSize(800, 800);
			jFrame.setVisible(true);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
