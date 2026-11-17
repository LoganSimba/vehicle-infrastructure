package com.pluralsight;

public class VehicleApplication {
    public static void main(String[] args) {
        //initialized Moped
        Moped slowRide = new Moped("loganRide", 23.00,"Red", false, false);

        //used inheritance to use Vehicle method and set the Mop class
        System.out.println(slowRide.getName() + " " + " top speed" + slowRide.getSpeed() );

    }
}
