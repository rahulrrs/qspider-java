package basics;

import java.util.Scanner;

public class Jsp {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Select the Institute: ");
        System.out.println("1. QSP");
        System.out.println("2. JSP");

        int institute = sc.nextInt();

        switch (institute) {
            case 1:
                System.out.println("QSP Page: ");
                System.out.println("1. Java");
                System.out.println("2. Testing");
                break;
            case 2:
                System.out.println("JSP Page: ");
                System.out.println("1. Java Full Stack");
                System.out.println("2. Web Technologies");
                break;
            default:
                System.out.println("Invalid institute selection.");
        }
    }
}
