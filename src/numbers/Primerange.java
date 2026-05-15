package numbers;

import java.util.Scanner;

public class Primerange {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter start : ");
        int start = sc.nextInt();

        System.out.print("Enter end : ");
        int end = sc.nextInt();

        printPrimes(start, end);
    }

    public static void printPrimes(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
