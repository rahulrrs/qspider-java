package arrays;

import java.util.Arrays;

public class ArrSort {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {3, 0, 0, 1, 0, 4, 0, 0},
            {1, 2, 3, 5, 6}
        };

        for (int[] row : arr) {
            Arrays.sort(row);
            System.out.println(Arrays.toString(row));
        }
    }
}
