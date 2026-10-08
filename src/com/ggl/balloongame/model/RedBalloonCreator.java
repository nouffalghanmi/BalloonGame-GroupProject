package com.ggl.balloongame.model;

import java.awt.Color;
import java.awt.Point;

public class RedBalloonCreator extends BalloonCreator {

  
    private final Balloon prototype = new Balloon(new Point(0, 0), Color.RED, 10);

    @Override
    protected Balloon factoryMethod() {
        return prototype.clone();
    }
}