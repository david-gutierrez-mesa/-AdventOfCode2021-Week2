package adventofcode.day6;

import adventofcode.common.FileReaderClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lanternfish {
    private Lanternfish() {
    }

    public static Long calculateNumber(String path, int days) {
        FileReaderClass fileReader = new FileReaderClass(path);
        List<Integer> lanternfishes = Arrays.stream(fileReader.readStrings().get(0).trim().split(",")).map(Integer::parseInt).collect(Collectors.toList());

        long[] daysToDuplicate = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (Integer lanternfish : lanternfishes) {
            daysToDuplicate[lanternfish] += 1;
        }

        long result = 0;

        for (int k = 0; k < days; k++) {
            long newFishes = daysToDuplicate[0];
            System.arraycopy(daysToDuplicate, 1, daysToDuplicate, 0, daysToDuplicate.length - 1);
            daysToDuplicate[6] += newFishes;
            daysToDuplicate[daysToDuplicate.length - 1] = newFishes;
        }

        for (long i : daysToDuplicate) {
            result += i;
        }
        return result;
    }
}
