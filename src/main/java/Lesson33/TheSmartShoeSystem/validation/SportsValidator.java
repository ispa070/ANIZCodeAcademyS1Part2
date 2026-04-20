package Lesson33.TheSmartShoeSystem.validation;

import Lesson33.TheSmartShoeSystem.exception.InvalidShoeSizeException;

public class SportsValidator implements ShoeValidator {

    @Override
    public void validate(int size) throws InvalidShoeSizeException {

        // Check if size is outside valid range
        if (size < 38 || size > 48) {
            throw new InvalidShoeSizeException("sports shoes must be between 38 and 48");
        }
    }
}
