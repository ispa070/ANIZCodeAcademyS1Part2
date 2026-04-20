package Lesson33.TheSmartShoeSystem.app;

import Lesson33.TheSmartShoeSystem.Solution.LuxuryValidator;
import Lesson33.TheSmartShoeSystem.Solution.SportsValidator;
import Lesson33.TheSmartShoeSystem.model.Shoe;
import Lesson33.TheSmartShoeSystem.validation.NormalValidator;
import Lesson33.TheSmartShoeSystem.validation.KidsValidator;
import Lesson33.TheSmartShoeSystem.exception.InvalidShoeSizeException;

/**
 * Main class to test the Shoe system
 */
public class Main {

    public static void main(String[] args) {

        // Create shoe with NORMAL validation strategy
        Shoe shoe = new Shoe(new NormalValidator());

        try {
            // Valid size
            shoe.printValidatorUpdate();
            shoe.setSize(40);

            // Invalid size for normal shoes → exception
            shoe.setSize(60);

        } catch (InvalidShoeSizeException e) {
            System.out.println("Change was not possible because " + e.getMessage());
        }

        // Switch to SportsValidator
        shoe.setValidator(new SportsValidator());
        shoe.printValidatorUpdate();

        try {
            shoe.setSize(45); // valid

            shoe.setSize(50); // invalid

        } catch (InvalidShoeSizeException e) {
            System.out.println("Change was not possible because " + e.getMessage());
        }

        // Switch to LuxuryValidator
        shoe.setValidator(new LuxuryValidator());
        shoe.printValidatorUpdate();

        try {
            shoe.setSize(42); // valid

            shoe.setSize(50); // invalid

        } catch (InvalidShoeSizeException e) {
            System.out.println("Change was not possible because " + e.getMessage());
        }

        shoe.setValidator(new KidsValidator());
        shoe.printValidatorUpdate();

        try {
            // Valid for kids
            shoe.setSize(30);

            // Invalid for kids → exception
            shoe.setSize(50);

        } catch (InvalidShoeSizeException e) {
            System.out.println("Change was not possible because " + e.getMessage());
        }

        // Final state
        System.out.println("Final shoe size: " + shoe.getSize());
        shoe.printValidatorUpdate();
    }
}