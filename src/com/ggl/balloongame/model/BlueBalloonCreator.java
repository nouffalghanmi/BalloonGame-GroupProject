package com.ggl.balloongame.model;

import java.awt.Color;
import java.awt.Point;

public class BlueBalloonCreator extends BalloonCreator {

    // النموذج اللي ننسخ منه (من الـ Prototype)
    private final Balloon prototype = new Balloon(new Point(0, 0), Color.BLUE, 10);

    @Override
    protected Balloon factoryMethod() {
        return prototype.clone();
    }
}