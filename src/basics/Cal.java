package basics;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Select the Input: ");
        int choice = sc.nextInt();

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Addition Result: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction Result: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication Result: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Division Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
