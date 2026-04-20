package Lesson30.UnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemigodTest {

    @Test // EXERCISE 1
    public void testGetCampCabin() {
    Demigod demigod = new Demigod("Thalia", "Zeus", 12);
    assertEquals("Cabin 1", demigod.getCampCabin());
    }

    @Test // EXERCISE 2
    public void testIsEligibleForQuest() {
        Demigod demigod = new Demigod("Silena", "Zeus", 8);
        assertFalse(demigod.isEligibleForQuest());
    }

    @Test // EXERCISE 3
    public void testEmptyNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Demigod("", "Zeus", 12);
        });
    }

    @Test // EXERCISE 4 - Boundary testing (checking if a different godParent works as well)
    public void testGetCampCabinBoundary() {
        Demigod demigod = new Demigod("Annabeth", "Athena", 12);
        assertEquals("Cabin 6", demigod.getCampCabin());
    }
}