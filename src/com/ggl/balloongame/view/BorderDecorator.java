package com.ggl.balloongame.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import com.ggl.balloongame.model.Balloon;

public class BorderDecorator extends BalloonDecorator {

    public BorderDecorator(BalloonRenderer decoratedRenderer) {
        super(decoratedRenderer);
    }

    @Override
    public void draw(Graphics g, Balloon balloon, Color color) {
        super.draw(g, balloon, color);
        drawBorder(g, balloon);
    }

    private void drawBorder(Graphics g, Balloon balloon) {
        g.setColor(Color.BLACK);

        Point p = balloon.getCenterPoint();
        int radius = balloon.getRadius();
        int diameter = radius + radius;

        g.drawOval(
                p.x - radius,
                p.y - radius,
                diameter,
                diameter
        );
    }
}
