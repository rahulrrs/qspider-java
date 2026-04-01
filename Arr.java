
import java.util.Arrays;
import java.util.Scanner;

public class Arr{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int i;
        int[] arr = new int[5];
        for(i=0; i<arr.length; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
            System.out.print(Arrays.toString    (arr));
    }
}