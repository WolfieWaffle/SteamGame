package com.github.wolfiewaffle.steamgame.display.swing;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.github.wolfiewaffle.steamgame.display.GameDisplay;

public class SwingGameDisplay extends GameDisplay {

	@Override
	public void makeWindow() {

		// The game window
		JFrame frame = new JFrame();

		// The thing inside the window
		SwingGamePanel panel = new SwingGamePanel();

		// Set up the window
		frame.setContentPane(panel);
		frame.setSize(800, 800);
		frame.setPreferredSize(new Dimension(800, 800));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
