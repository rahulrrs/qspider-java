import java.util.Scanner;

public class Grade {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the Marks: ");
        double percentage = sc.nextDouble();
        
        if(percentage>=0 && percentage <=34){
            System.out.println("Fail");
        }
        else if(percentage>=35 && percentage <=60){
            System.out.println("C");
        }
        else if(percentage>=61 && percentage <=90){
            System.out.println("B");
        }
        else if(percentage>=91 && percentage<=100){
            System.out.println("A");
        }
        else{
            System.out.println("Invalid");
        }
    }
}