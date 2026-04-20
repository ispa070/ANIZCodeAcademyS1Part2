package Lesson33.ExceptionHierarchyDesignPrincip.model;

import Lesson33.ExceptionHierarchyDesignPrincip.Exceptions.*;

public class Bike implements Rideable {

    @Override
    public void ride(int tirePressure, boolean brakesWorking, int cargoLoad) throws BikeException {
        if (tirePressure < 20) {
            throw new FlatTireException();
        }

        if (!brakesWorking) {
            throw new BrakeFailureException();
        }

        System.out.println("You are riding safely 🚲");
    }
}