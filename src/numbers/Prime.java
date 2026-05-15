package numbers;

import java.util.Scanner;

public class Prime {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
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
