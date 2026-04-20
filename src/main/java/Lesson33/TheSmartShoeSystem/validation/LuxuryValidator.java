package Lesson33.TheSmartShoeSystem.validation;

import Lesson33.TheSmartShoeSystem.exception.InvalidShoeSizeException;

public class LuxuryValidator implements ShoeValidator {

    @Override
    public void validate(int size) throws InvalidShoeSizeException {

        // Check if size is outside valid range
        if (size < 40 || size > 45) {
            throw new InvalidShoeSizeException("luxury shoes must be between 40 and 45");
        }
    }
}
