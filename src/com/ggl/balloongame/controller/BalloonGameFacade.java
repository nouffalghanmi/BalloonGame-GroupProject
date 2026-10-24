
package com.ggl.balloongame.controller;

import java.awt.Point;

import com.ggl.balloongame.model.Balloon;
import com.ggl.balloongame.model.BalloonGameModel;
import com.ggl.balloongame.view.BalloonGameFrame;

public class BalloonGameFacade {

    private final BalloonGameModel model;
    private final BalloonGameFrame view;

    public BalloonGameFacade(BalloonGameFrame view,
                             BalloonGameModel model) {
        this.view = view;
        this.model = model;
    }

    public void startNewGame(int count) {
        model.initialize();
        model.createBalloons(count);
        model.calculateScore();
        refreshView();
    }

    public void lockScore() {
        model.setGameOver(true);
        model.calculateScore();
        model.updateHighScore();
        refreshView();
    }

    public void expandBalloon(Point point) {
        if (!model.isGameOver()) {
            Balloon balloon = model.getValidBalloon(point);

            if (balloon != null) {
                balloon.expand();
                model.isTouching();
                model.calculateScore();
                refreshView();
            }
        }
    }

    private void refreshView() {
        view.updateControlPanel();
        view.repaint();
    }
}
