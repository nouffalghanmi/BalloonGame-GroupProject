package com.ggl.balloongame.view;

import java.awt.Color;
import java.awt.Graphics;

import com.ggl.balloongame.model.Balloon;

public interface BalloonRenderer {

    void draw(Graphics g, Balloon balloon, Color color);
}
