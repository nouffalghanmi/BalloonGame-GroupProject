package com.ggl.balloongame.controller;

import java.awt.Point;

import com.ggl.balloongame.model.Balloon;
import com.ggl.balloongame.model.BalloonGameModel;

public class BalloonGameFacade {

    private final BalloonGameModel model;

    public BalloonGameFacade(BalloonGameModel model) {
        this.model = model;
    }

    public void startNewGame(int count) {
        model.initialize();
        model.createBalloons(count);
        model.calculateScore();
    }

    public void lockScore() {
        model.setGameOver(true);
        model.calculateScore();
        model.updateHighScore();
    }

    public boolean expandBalloon(Point point) {

        if (!model.isGameOver()) {

            Balloon balloon = model.getValidBalloon(point);

            if (balloon != null) {
                balloon.expand();
                model.isTouching();
                model.calculateScore();

                return true;
            }
        }

        return false;
    }
}