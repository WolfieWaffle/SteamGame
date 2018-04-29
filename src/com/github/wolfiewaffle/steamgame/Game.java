package com.github.wolfiewaffle.steamgame;

import com.github.wolfiewaffle.steamgame.display.GameDisplay;
import com.github.wolfiewaffle.steamgame.display.swing.SwingGameDisplay;

public class Game {
	GameDisplay display;

	public Game() {
		display = new SwingGameDisplay();
	}

	public void init() {
		display.makeWindow();
	}

}
