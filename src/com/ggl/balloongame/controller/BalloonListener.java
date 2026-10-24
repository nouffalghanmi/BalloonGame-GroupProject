package com.ggl.balloongame.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class BalloonListener extends MouseAdapter {
	
    private final BalloonGameFacade facade;


	public BalloonListener(BalloonGameFacade facade) {
		this.facade = facade;
	}

	@Override
	public void mousePressed(MouseEvent event) {
		if (MouseEvent.BUTTON1 == event.getButton()) {	
			facade.expandBalloon(event.getPoint());
		}
	}

}
