package com.ggl.balloongame.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.ggl.balloongame.controller.BalloonListener;
import com.ggl.balloongame.model.Balloon;
import com.ggl.balloongame.model.BalloonGameModel;
import com.ggl.balloongame.controller.BalloonGameFacade;

public class DrawingPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private final BalloonGameModel model;
	private final BalloonRenderer renderer;

	public DrawingPanel(BalloonGameModel model, BalloonGameFacade facade) {
    this.model = model;

	this.renderer = new BorderDecorator(new BasicBalloonRenderer());

    this.setPreferredSize(model.getDrawingPanelDimension());
    this.addMouseListener(new BalloonListener(facade));
}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (Balloon balloon : model.getValidBalloons()) {
			
			renderer.draw(g, balloon, balloon.getColor());
		}
		
		for (Balloon balloon : model.getPoppedBalloons()) {
         
			renderer.draw(g, balloon, Color.LIGHT_GRAY);
		}
	}

}
