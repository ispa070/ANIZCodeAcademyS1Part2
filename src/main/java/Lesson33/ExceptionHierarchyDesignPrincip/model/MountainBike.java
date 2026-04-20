package Lesson33.ExceptionHierarchyDesignPrincip.model;


import Lesson33.ExceptionHierarchyDesignPrincip.Exceptions.*;

public class MountainBike implements Rideable {

    @Override
    public void ride(int tirePressure, boolean brakesWorking, int cargoLoad) throws BikeException {

        if (tirePressure < 10) { // lower threshold
            throw new FlatTireException();
        }

        if (!brakesWorking) {
            throw new BrakeFailureException();
        }

        System.out.println("Mountain bike handles the terrain 🏔️");
    }
}