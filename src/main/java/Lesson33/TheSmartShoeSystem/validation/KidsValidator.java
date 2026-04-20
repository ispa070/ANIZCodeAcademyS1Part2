package Lesson33.TheSmartShoeSystem.validation;


import Lesson33.TheSmartShoeSystem.exception.InvalidShoeSizeException;

/**
 * Kids shoe rules
 * Example: size must be between 20 and 35
 */
public class KidsValidator implements ShoeValidator {

    @Override
    public void validate(int size) throws InvalidShoeSizeException {

        if (size < 20 || size > 35) {
            throw new InvalidShoeSizeException("kids shoes must be between 20 and 35");
        }
    }
}