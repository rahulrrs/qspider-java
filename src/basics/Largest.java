package basics;

import java.util.Scanner;

public class Largest {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();

        System.out.println(largest(n1, n2, n3));
    }

    public static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
