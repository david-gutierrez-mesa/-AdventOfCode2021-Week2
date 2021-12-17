package adventofcode;

import adventofcode.day6.Lanternfish;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day6Test {

    @Test
    @DisplayName("Test Part I")
    public void testPartI() {
        assertEquals(5934, Lanternfish.calculateNumber("Day5_Example.txt"),
                "Result is not the expected one");
    }

/*    @Test
    @DisplayName("Test Part II")
    public void testPartII() {
        assertEquals(1924, Lanternfish.calculateNumber("Day5_Example.txt"),
                "Result is not the expected one");
    }*/
}
