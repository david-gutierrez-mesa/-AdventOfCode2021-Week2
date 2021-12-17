package adventofcode.day6;

public class Day6 {
    public static void main(String[]args) {

        Long numberOfLanternfish = Lanternfish.calculateNumber("data_day6.txt", 80);
        System.out.println("The result of part I is: " + numberOfLanternfish);

        Long numberOfLanternfishII =  Lanternfish.calculateNumber("data_day6.txt", 256);
        System.out.println("The result of part II is: " + numberOfLanternfishII);

    }
}
