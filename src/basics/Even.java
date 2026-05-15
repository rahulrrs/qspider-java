package basics;

import java.util.Scanner;

public class Even {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        display(n);
    }

    public static void display(int n) {
        int start = n % 2 == 0 ? n : n - 1;

        for (int i = start; i >= 1; i -= 2) {
            System.out.println(i);
        }
    }
}
