package com.posh.introduction_to_oops.Properties.Inheritance;

class BoxSpeed extends Box{
    double speed;

    public BoxSpeed() {
        super();
    }

    public BoxSpeed(double side, double speed) {
        super(side);
        this.speed = speed;
    }

    public BoxSpeed(double l, double w, double h, double speed) {
        super(l, w, h);
        this.speed = speed;
    }


    public BoxSpeed(BoxSpeed other) {

        super(other);
        this.speed = other.speed;
    }
}
