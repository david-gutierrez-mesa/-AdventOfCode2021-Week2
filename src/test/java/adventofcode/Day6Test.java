package adventofcode;

import adventofcode.day6.Lanternfish;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day6Test {

    @Test
    @DisplayName("Test One Part I")
    public void testOnePartI() {
        assertEquals(26, Lanternfish.calculateNumber("Day6_Example.txt", 18),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Test Two Part I")
    public void testTwoPartI() {
        assertEquals(5934, Lanternfish.calculateNumber("Day6_Example.txt", 80),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Test Part II")
    public void testPartII() {
        assertEquals(26984457539L, Lanternfish.calculateNumber("Day6_Example.txt", 256),
                "Result is not the expected one");
    }
}

