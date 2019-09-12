package Section3.DSAlgorithmsJavaEleven;

import java.lang.*;
import java.time.*;

public class DuplicateChecker {

    public static void main(String[] args) {

        // 500 random, unsorted numbers ranging from 0 to 100
        int classGrades[] = {4, 20, 87, 53, 94, 91, 74, 66, 53, 75, 33, 30, 54, 46,
                45, 69, 94, 85, 28, 5, 90, 87, 8, 68, 91, 38, 15, 21, 34, 1, 75, 4,
                5, 70, 73, 75, 14, 28, 88, 49, 58, 69, 56, 28, 26, 56, 78, 6, 95, 6,
                2, 14, 55, 68, 44, 97, 71, 54, 60, 50, 68, 95, 84, 93, 45, 70, 85, 86,
                32, 19, 55, 49, 25, 43, 68, 69, 96, 55, 12, 21, 100, 61, 81, 32, 66,
                57, 82, 34, 42, 88, 66, 67, 93, 19, 21, 25, 9, 59, 55, 0, 46, 93, 37,
                79, 53, 73, 10, 99, 35, 24, 55, 13, 46, 44, 93, 42, 68, 100, 0, 64, 26,
                88, 45, 67, 75, 88, 32, 42, 22, 27, 37, 29, 5, 58, 22, 78, 3, 35, 62, 12,
                95, 83, 73, 76, 45, 35, 38, 18, 25, 66, 74, 22, 66, 34, 86, 6, 95, 5, 88,
                43, 92, 64, 65, 26, 50, 99, 59, 67, 80, 66, 58, 59, 34, 84, 50, 93, 28,
                90, 94, 31, 64, 53, 94, 23, 10, 49, 48, 77, 82, 48, 66, 12, 9, 18, 51,
                61, 48, 58, 69, 75, 16, 51, 66, 33, 48, 26, 16, 8, 81, 95, 85, 61, 60,
                71, 74, 79, 55, 8, 64, 11, 19, 40, 5, 40, 30, 6, 50, 4, 44, 10, 31, 69,
                67, 56, 68, 18, 30, 38, 21, 27, 56, 37, 16, 69, 27, 7, 66, 71, 41, 81,
                31, 85, 2, 97, 41, 1, 99, 12, 19, 44, 35, 16, 7, 80, 30, 90, 57, 81, 99,
                30, 41, 32, 19, 46, 38, 49, 1, 10, 40, 86, 90, 77, 65, 16, 40, 16, 82, 63,
                67, 10, 60, 87, 75, 92, 55, 19, 19, 73, 54, 50, 21, 70, 20, 3, 11, 98, 63,
                85, 25, 81, 88, 71, 37, 86, 92, 50, 68, 95, 60, 2, 66, 97, 48, 18, 84, 74,
                40, 11, 28, 71, 72, 67, 70, 12, 36, 23, 19, 23, 3, 12, 66, 84, 52, 64, 17,
                45, 12, 93, 62, 99, 11, 52, 31, 90, 48, 75, 69, 7, 96, 16, 33, 21, 79, 17,
                50, 60, 34, 60, 87, 10, 3, 50, 89, 20, 18, 72, 25, 14, 96, 58, 63, 58, 16,
                51, 51, 15, 86, 76, 74, 72, 1, 67, 63, 89, 22, 43, 42, 98, 4, 66, 5, 46,
                21, 18, 14, 7, 31, 94, 39, 54, 22, 42, 14, 55, 60, 38, 17, 64, 23, 45, 82,
                90, 83, 19, 40, 69, 61, 26, 91, 27, 47, 48, 38, 20, 54, 30, 24, 44, 48, 17,
                33, 18, 96, 38, 89, 1, 14, 8, 31, 69, 67, 1, 76, 64, 18, 53, 21, 0, 44, 3,
                82, 48, 14, 15, 28, 31, 48, 7, 7, 96, 40, 54, 55, 94, 58, 33, 17, 97, 91,
                69, 40, 17, 50, 1, 96, 47, 20, 31, 100, 29, 54, 51, 3, 20, 6, 4, 23, 37,
                79, 56};
        int i, j;

        // Save current date-time in UTC
        Instant start = Instant.now();


        // search for duplicates
        outerloop:
        for (i = 0; i < classGrades.length; i++) {
            for (j = 0; j < classGrades.length; j++) {
                if (i != j && classGrades[i] == classGrades[j]) {
                    System.out.println("Duplicate value found: " + classGrades[i]);
                    break outerloop;
                }
            }
            System.out.println("No duplicate value found.");
        }

        // Save current date-time in UTC
        Instant end = Instant.now();
        System.out.println("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");

    }
}
