package adventofcode;

import adventofcode.day3.Diagnostic;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day3Test {

    @Test
    @DisplayName("Test Part I")
    public void testPartI() {
        assertEquals(198, Diagnostic.powerConsumption("Day3_Example.txt"),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Test Part II")
    public void testPartII() {
        assertEquals(230, Diagnostic.lifeSupportRating("Day3_Example.txt"),
                "Result is not the expected one");
    }
}
