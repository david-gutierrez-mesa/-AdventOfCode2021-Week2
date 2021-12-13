package adventofcode;

import adventofcode.day2.Submarine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day2Test {
    @Test
    @DisplayName("Test for Day 2 part I")
    public void testDay2PartI() {
        assertEquals(150, Submarine.Pilot("Day2_Example.txt"),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Test for Day 2 part II")
    public void testDay2PartII() {
        assertEquals(900, Submarine.PilotManual("Day2_Example.txt"),
                "Result is not the expected one");
    }
}
