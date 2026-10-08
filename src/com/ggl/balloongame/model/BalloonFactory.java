package com.ggl.balloongame.model;

import java.awt.Color;
import java.awt.Point;

public class BalloonFactory {

    public enum BalloonType { RED, BLUE, MAGENTA }

    private static final int INITIAL_RADIUS = 10;

    //Prototype Pattern
    private final Balloon redPrototype =
            new Balloon(new Point(0, 0), Color.RED, INITIAL_RADIUS);
    private final Balloon bluePrototype =
            new Balloon(new Point(0, 0), Color.BLUE, INITIAL_RADIUS);
    private final Balloon magentaPrototype =
            new Balloon(new Point(0, 0), Color.MAGENTA, INITIAL_RADIUS);

    
    public Balloon createBalloon(BalloonType type, Point center) {
        Balloon balloon;
        switch (type) {
            case RED:
                balloon = redPrototype.clone();
                break;
            case BLUE:
                balloon = bluePrototype.clone();
                break;
            case MAGENTA:
                balloon = magentaPrototype.clone();
                break;
            default:
                throw new IllegalArgumentException("Unknown balloon type: " + type);
        }
        balloon.setCenterPoint(center);
        return balloon;
    }

    
    public Balloon createRandomBalloon(Point center) {
        BalloonType[] types = BalloonType.values();
        BalloonType type = types[(int) (Math.random() * types.length)];
        return createBalloon(type, center);
    }
}
