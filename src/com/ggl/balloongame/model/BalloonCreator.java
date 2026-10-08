package com.ggl.balloongame.model;

import java.awt.Point;

public abstract class BalloonCreator {

    // FactoryMethod(): كل ConcreteCreator يحدد لون البالون
    protected abstract Balloon factoryMethod();

    // AnOperation(): تستخدم الـ factoryMethod
    public Balloon createBalloon(Point center) {
        Balloon balloon = factoryMethod();
        balloon.setCenterPoint(center);
        return balloon;
    }
}