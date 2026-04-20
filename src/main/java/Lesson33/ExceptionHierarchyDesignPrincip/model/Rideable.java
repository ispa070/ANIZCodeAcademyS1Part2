package Lesson33.ExceptionHierarchyDesignPrincip.model;

import Lesson33.ExceptionHierarchyDesignPrincip.Exceptions.BikeException;

public interface Rideable {
    void ride(int tirePressure, boolean brakesWorking, int cargoLoad) throws BikeException;
}