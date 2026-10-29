package com.ggl.balloongame.view;

import java.awt.Color;
import java.awt.Graphics;

import com.ggl.balloongame.model.Balloon;

public abstract class BalloonDecorator implements BalloonRenderer {

    protected final BalloonRenderer decoratedRenderer;

    public BalloonDecorator(BalloonRenderer decoratedRenderer) {
        this.decoratedRenderer = decoratedRenderer;
    }

    @Override
    public void draw(Graphics g, Balloon balloon, Color color) {
        decoratedRenderer.draw(g, balloon, color);
    }
}
