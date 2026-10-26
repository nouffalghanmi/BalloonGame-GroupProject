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
        int offset = Math.max(3, r / 5);
        g.setColor(new Color(0, 0, 0, 80));
        g.fillOval(p.x - r + offset, p.y - r + offset, r + r, r + r);
    }

    @Override
    public Balloon clone() {
        return new ShadowBalloonDecorator(decoratedBalloon.clone());
    }
}