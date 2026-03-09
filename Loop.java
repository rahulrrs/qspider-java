import java.util.Scanner;

public class Loop {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.println("COUNT: "+count(number));
    }
    public static int count(int number) {
        
        int count = 0;
        while(number!=0){
            number = number/10;
            count++;
        }
        return count;
    }
}