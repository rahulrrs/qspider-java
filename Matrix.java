import java.util.Scanner;
public class Matrix{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [][] arr = new int[3][5];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Enter the value of arr["+(i+1)+"]["+(j+1)+"]");
                arr[i][j] = sc.nextInt();
            }
        }   
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}