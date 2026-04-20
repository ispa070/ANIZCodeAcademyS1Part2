package Lesson33.ExceptionHierarchyDesignPrincip.model;

import Lesson33.ExceptionHierarchyDesignPrincip.Exceptions.*;

public class CargoBike implements Rideable {

    @Override
    public void ride(int tirePressure, boolean brakesWorking, int cargoLoad) throws BikeException {

        if (cargoLoad > 100) {
            throw new OverloadException();
        }

        System.out.println("Your cargo bike holds less than 100 kg and rides safely🚲");
    }
}
