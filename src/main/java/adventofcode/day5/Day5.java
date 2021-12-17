package adventofcode.day5;

public class Day5 {
    public static void main(String[]args) {

        int segmentsValue = Hydrothermal.segments("data_day5.txt");
        System.out.println("The result of part I is: " + segmentsValue);

        int segmentsValue2 = Hydrothermal.segmentsWithDiagonal("data_day5.txt");
        System.out.println("The result of part II is: " + segmentsValue2);

    }
}
