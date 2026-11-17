package com.pluralsight;

public class Moped extends Vehicle{
    private boolean helmetOn;
    private boolean kickStandDown;

    public Moped(String name, double speed, String color, boolean helmetOn, boolean kickStandDown){
        super(name, speed, color);
        this.helmetOn = helmetOn;
        this.kickStandDown = kickStandDown;

    }
}
