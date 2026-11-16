package com.pluralsight;

public class VehicleApplication {
    public static void main(String[] args) {
        //initialized Moped
        Moped slowRide = new Moped();

        //used inheritance to use Vehicle method and set the Mop class
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(40);

        System.out.println(slowRide.getColor() + ", " + slowRide.getFuelCapacity());

    }
}
