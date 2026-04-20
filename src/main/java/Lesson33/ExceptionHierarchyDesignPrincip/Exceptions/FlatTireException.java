package Lesson33.ExceptionHierarchyDesignPrincip.Exceptions;

public class FlatTireException extends BikeException {
    public FlatTireException() {
        super("The bike has a flat tire!");
    }
}