
package com.ggl.balloongame.model;

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
}
