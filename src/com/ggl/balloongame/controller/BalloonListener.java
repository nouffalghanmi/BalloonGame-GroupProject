package com.ggl.balloongame.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.ggl.balloongame.view.BalloonGameFrame;


public class BalloonListener extends MouseAdapter {
	
    private final BalloonGameFrame view;
	private final BalloonGameFacade facade;


	public BalloonListener(
            BalloonGameFrame view,
            BalloonGameFacade facade) {

        this.view = view;
        this.facade = facade;
    }

	@Override
	public void mousePressed(MouseEvent event) {
		if (MouseEvent.BUTTON1 == event.getButton()) {

            if (facade.expandBalloon(event.getPoint())) {
                view.updateControlPanel();
                view.repaint();
            }
		}
	}

}
