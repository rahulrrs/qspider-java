package basics;

import java.util.Scanner;

public class Loop {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        System.out.println("COUNT: " + count(number));
    }

    public static int count(int number) {
        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }

        return count;
    }
}
