import java.util.Scanner;
public class Primerange {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter start : ");
        int start = sc.nextInt();
        System.out.print("Enter end : ");
        int end = sc.nextInt();
        prime(start, end);
    }
    public static void prime(int start, int end) {
        int count = 0;
        int i;
        for(i = start;i<=end;i++){
            if(start%i==0){
                count++;
                }
        }
            if(count==2){
                System.out.println(i);
            
        }
    }
}
