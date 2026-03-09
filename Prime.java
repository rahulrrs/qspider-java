import java.util.Scanner;

public class Prime {
    static Scanner sc = new Scanner(System.in);

    public static void check_prime(int number) {
        int count = 0;

        for(int i = 1; i <= number; i++) {
            if(number % i == 0){
                count++;
            }
        }

        if(count == 2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();
        check_prime(number);
    }
}