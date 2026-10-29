package com.ggl.balloongame.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import com.ggl.balloongame.model.Balloon;

public class BasicBalloonRenderer implements BalloonRenderer {

    @Override
    public void draw(Graphics g, Balloon balloon, Color color) {
        g.setColor(color);

        Point p = balloon.getCenterPoint();
        int radius = balloon.getRadius();
        int diameter = radius + radius;

        g.fillOval(
                p.x - radius,
                p.y - radius,
                diameter,
                diameter
        );
    }
}
