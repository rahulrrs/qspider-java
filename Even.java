import java.util.Scanner;

public class Even {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        display(n);
    }
    public static void display(int n) {
        if(n%2==0){
            for(int i = n;i>=1;i-=2){
                System.out.println(i);
            }
        }
        else{
            for(int i=n-1;i>=1;i-=2){
                System.out.println(i);
            }
        }
    }   
}