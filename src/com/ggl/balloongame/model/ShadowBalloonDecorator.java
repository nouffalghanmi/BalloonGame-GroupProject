package com.ggl.balloongame.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class ShadowBalloonDecorator extends BalloonDecorator {

    public ShadowBalloonDecorator(Balloon decoratedBalloon) {
        super(decoratedBalloon);
    }

    @Override
    public void draw(Graphics g) {
        addShadow(g);
        decoratedBalloon.draw(g);
    }

    private void addShadow(Graphics g) {
        Point p = getCenterPoint();
        int r = getRadius();
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(p.x - r + 5,p.y - r + 5,r + r,r + r);
    }

    @Override
    public Balloon clone() {
        return new ShadowBalloonDecorator(decoratedBalloon.clone());
    }
}