import java.util.Scanner;

public class Largest{
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int n1,n2,n3;
        n1= sc.nextInt();
        n2= sc.nextInt();
        n3= sc.nextInt();
        System.out.println(largest(n1, n2, n3));
    }
    public static int largest(int a, int b, int c) {
        if(a>b && a>c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }
}