import java.util.Scanner;

public class Char{
    public static void main(String[] args) {
        skip();
    }
    public static void skip() {
        for(int i = 1; i<=10;i++){
            if(i==5||i==8){
                continue;
            }
            System.out.print(i+" ");
        }
    }   
}