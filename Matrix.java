import java.util.Scanner;
public class Matrix{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [][] arr = {
            {3,5,6,7},
            {3,8,4,2,1,5,6},
            {3,5,6,7},
            {3,8,4,2,1,5,6},
            {3,5,6,7},
            {3,8,4,2,1,5,6}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ "|"); 
            }
        System.out.println(" ");
        
        }   
    }
}