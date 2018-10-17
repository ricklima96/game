package com.ricardo.game.states;

import java.awt.Color;
import java.awt.Graphics2D;

import com.ricardo.game.util.KeyHandler;
import com.ricardo.game.util.MouseHandler;

public class PlayState extends GameState {

	public PlayState(GameStateManager gsm) {
		super(gsm);
	}

	public void update() {

	}

	public void input(MouseHandler mouse, KeyHandler key) {

	}

	public void render(Graphics2D g) {
		g.setColor(Color.RED);
		g.drawRect(100, 100, 200, 200);
	}

}
