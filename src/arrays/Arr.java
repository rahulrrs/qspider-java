
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
