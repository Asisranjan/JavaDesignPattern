package com.example.designpattern.ch11.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {

	ImageIcon icon;
	URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;
	
	public ImageProxy(URL url) {
		this.imageURL = url;
	}
	
	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		if (icon != null) {
			return icon.getIconHeight();
		}
		return 800;
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		if (icon != null) {
			return icon.getIconWidth();
		}
		return 800;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		if (icon != null) {
			icon.paintIcon(c, g, x, y);
		}
		else {
			System.out.println("Loading icon");
			g.drawString("Loading Icon, Please wait...", x, y);
			if (!retrieving) {
				retrieving = true;
				retrievalThread = new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						try{
							icon = new ImageIcon(imageURL, "CD cover");
							c.repaint();
						}
						catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}

}
