package com.ggl.balloongame.model;

import java.awt.Color;
import java.awt.Point;

public class MagentaBalloon extends Balloon {

    public MagentaBalloon(Point centerPoint, int radius) {
        super(centerPoint, Color.MAGENTA, radius);
    }

    @Override
    public Balloon clone() {
        return new MagentaBalloon(
                new Point(getCenterPoint()),
                getRadius()
        );
    }
}