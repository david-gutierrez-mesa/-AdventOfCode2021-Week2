package adventofcode.day5;

import adventofcode.common.FileReaderClass;

import java.util.List;

import static java.lang.Math.abs;

public class Hydrothermal {
    private Hydrothermal() {
    }

    public static int segments(String path) {
        FileReaderClass fileReader = new FileReaderClass(path);
        List<String> lines = fileReader.readStrings();

        int[][] matrix = new int[1000][1000];

        for (String line : lines) {
            String[] lineValues = line.split(" -> ");
            String[] origin = lineValues[0].trim().split(",");
            String[] destination = lineValues[1].trim().split(",");
            int xOrigin = Integer.parseInt(origin[0]);
            int yOrigin = Integer.parseInt(origin[1]);
            int xDestination = Integer.parseInt(destination[0]);
            int yDestination = Integer.parseInt(destination[1]);

            if (xDestination == xOrigin) {
                int yMin;
                int yMax;
                if (yDestination < yOrigin) {
                    yMin = yDestination;
                    yMax = yOrigin;
                } else {
                    yMin = yOrigin;
                    yMax = yDestination;
                }
                for (int j = yMin; j <= yMax; j++) {
                    matrix[xOrigin][j]++;
                }
            } else if (yDestination == yOrigin) {
                int xMin;
                int xMax;
                if (xDestination < xOrigin) {
                    xMin = xDestination;
                    xMax = xOrigin;
                } else {
                    xMin = xOrigin;
                    xMax = xDestination;
                }
                for (int j = xMin; j <= xMax; j++) {
                    matrix[j][yOrigin]++;
                }
            }
        }
        int result = 0;
        for (int[] ints : matrix) {
            for (int z = 0; z < matrix.length; z++) {
                if (ints[z] >= 2) {
                    result++;
                }
            }
        }

        return result;
    }

    public static int segmentsWithDiagonal(String path) {
        FileReaderClass fileReader = new FileReaderClass(path);
        List<String> lines = fileReader.readStrings();

        int[][] matrix = new int[1000][1000];

        for (String line : lines) {
            String[] lineValues = line.split(" -> ");
            String[] origin = lineValues[0].trim().split(",");
            String[] destination = lineValues[1].trim().split(",");
            int xOrigin = Integer.parseInt(origin[0]);
            int yOrigin = Integer.parseInt(origin[1]);
            int xDestination = Integer.parseInt(destination[0]);
            int yDestination = Integer.parseInt(destination[1]);


            if(abs(xOrigin-xDestination) == abs(yOrigin-yDestination)){
                if (yDestination < yOrigin) {
                    int i = xOrigin;
                    for (int j = yOrigin; j >= yDestination; j--) {
                        if (xDestination < xOrigin) {
                            matrix[i][j]++;
                            i --;
                        } else {
                            matrix[i][j]++;
                            i ++;
                        }
                    }
                    }else{
                        int i = xOrigin;
                        for (int j = yOrigin; j <= yDestination; j++) {
                            if (xDestination < xOrigin) {
                                matrix[i][j]++;
                                i --;
                            } else {
                                matrix[i][j]++;
                                i ++;
                            }
                        }
                    }
                }
            if (xDestination == xOrigin) {
                int yMin;
                int yMax;
                if (yDestination < yOrigin) {
                    yMin = yDestination;
                    yMax = yOrigin;
                } else {
                    yMin = yOrigin;
                    yMax = yDestination;
                }
                for (int j = yMin; j <= yMax; j++) {
                    matrix[xOrigin][j]++;
                }
            } else if (yDestination == yOrigin) {
                int xMin;
                int xMax;
                if (xDestination < xOrigin) {
                    xMin = xDestination;
                    xMax = xOrigin;
                } else {
                    xMin = xOrigin;
                    xMax = xDestination;
                }
                for (int j = xMin; j <= xMax; j++) {
                    matrix[j][yOrigin]++;
                }
            }
        }
        int result = 0;
        for (int[] ints : matrix) {
            for (int z = 0; z < matrix.length; z++) {
                if (ints[z] >= 2) {
                    result++;
                }
            }
        }

        return result;
    }
}
