import java.util.Scanner;

public class Cal {

    static volatile boolean isProcessing = true; // shared flag

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Select the Input: ");
        int choice = sc.nextInt();

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        // Thread that simulates long processing
        Thread sleepThread = new Thread(() -> {
            try {
                Thread.sleep(6000); // sleep for 6 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isProcessing = false; // stop animation
        });

        sleepThread.start();

        // Processing animation runs until sleep is done
        String[] loading = {"Processing.", "Processing..", "Processing..."};
        int i = 0;

        while (isProcessing) {
            System.out.print("\r" + loading[i % 3]);
            i++;
            Thread.sleep(5000);
        }

        System.out.println("\rProcessing Done!        ");

        // Switch after sleep completes
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
                if (b != 0)
                    System.out.println("Division Result: " + (a / b));
                else
                    System.out.println("Cannot divide by zero!");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}