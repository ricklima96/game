package com.ricardo.game;

import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	public static int width;
	public static int height;
	
	private Thread thread;
	
	public GamePanel(int width, int height) {
		setPreferredSize(new Dimension(width, height));
		setFocusable(true);
		requestFocus();
	}
	
	public void addNotify() {
		super.addNotify();
	}
	
	public void run() {
		if(thread == null) {
			thread = new Thread(this, "GameThread");
			thread.start();
		}
		
	}

}
