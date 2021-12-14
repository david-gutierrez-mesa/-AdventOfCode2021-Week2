package adventofcode;

import adventofcode.day4.Bingo;
import adventofcode.day5.Hydrothermal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day5Test {

    @Test
    @DisplayName("Test Part I")
    public void testPartI() {
        assertEquals(5, Hydrothermal.segments("Day5_Example.txt"),
                "Result is not the expected one");
    }

/*    @Test
    @DisplayName("Test Part II")
    public void testPartII() {
        assertEquals(1924, Bingo.findLoser("Day5_Example.txt"),
                "Result is not the expected one");
    }*/
}
