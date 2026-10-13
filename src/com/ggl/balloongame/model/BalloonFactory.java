package com.ggl.balloongame.model;

import java.awt.Point;

public class BalloonFactory {

    public Balloon getBalloon(String balloonType) {

        if (balloonType == null) {
            return null;
        }

        if (balloonType.equalsIgnoreCase("RED")) {

            return new RedBalloon(
                    new Point(0, 0),
                    10
            );

        } else if (balloonType.equalsIgnoreCase("BLUE")) {

            return new BlueBalloon(
                    new Point(0, 0),
                    10
            );

        } else if (balloonType.equalsIgnoreCase("MAGENTA")) {

            return new MagentaBalloon(
                    new Point(0, 0),
                    10
            );
        }

        return null;
    }
}