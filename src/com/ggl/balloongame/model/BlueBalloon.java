package com.ggl.balloongame.model;

import java.awt.Color;
import java.awt.Point;

public class BlueBalloon extends Balloon {

    public BlueBalloon(Point centerPoint, int radius) {
        super(centerPoint, Color.BLUE, radius);
    }

    @Override
    public Balloon clone() {
        return new BlueBalloon(
                new Point(getCenterPoint()),
                getRadius()
        );
    }
}