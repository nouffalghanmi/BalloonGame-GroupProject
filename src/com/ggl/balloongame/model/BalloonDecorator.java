package com.ggl.balloongame.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class BalloonDecorator extends Balloon {

    protected Balloon decoratedBalloon;

    public BalloonDecorator(Balloon decoratedBalloon) {
        super(decoratedBalloon.getCenterPoint(),
              decoratedBalloon.getColor(),
              decoratedBalloon.getRadius());
        this.decoratedBalloon = decoratedBalloon;
    }

    @Override
    public void draw(Graphics g) {
        decoratedBalloon.draw(g);
    }

    @Override
    public void expand() {
        decoratedBalloon.expand();
    }

    @Override
    public boolean isTouching(Balloon other) {
        return decoratedBalloon.isTouching(other);
    }

    @Override
    public int getSize() {
        return decoratedBalloon.getSize();
    }

    @Override
    public int getRadius() {
        return decoratedBalloon.getRadius();
    }

    @Override
    public Color getColor() {
        return decoratedBalloon.getColor();
    }

    @Override
    public Point getCenterPoint() {
        return decoratedBalloon.getCenterPoint();
    }

    @Override
    public void setCenterPoint(Point centerPoint) {
        decoratedBalloon.setCenterPoint(centerPoint);
    }
}