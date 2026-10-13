package com.ggl.balloongame.model;

import java.awt.Color;
import java.awt.Point;

public class RedBalloon extends Balloon {

    public RedBalloon(Point centerPoint, int radius) {
        super(centerPoint, Color.RED, radius);
    }

    @Override
    public Balloon clone() {
        return new RedBalloon(
                new Point(getCenterPoint()),
                getRadius()
        );
    }
}