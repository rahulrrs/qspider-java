import java.util.Scanner;

public class Primealt {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        System.out.println(prime(number));
    }
    public static int prime(int number) {
        if (number <= 1) {
            return 0;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}