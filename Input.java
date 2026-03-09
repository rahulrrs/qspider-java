import java.util.Scanner;
public class Input{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Student id : ");
        int sid = sc.nextInt();
        System.out.print("Enter Student marks : ");
        double smarks = sc.nextDouble();
        System.out.print("Enter Student contact : ");
        long scontact = sc.nextLong();
        System.out.println("Student ID :"+ sid);
        System.out.println("Student mark :"+ smarks);
        System.out.println("Student contact :"+ scontact);
    }
}
