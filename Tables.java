    import java.util.Scanner;

    public class Tables {
        static Scanner sc = new Scanner(System.in);
        public static void print_table(int start, int end) {
            for(int i = 1;i<=10;i++){
                for(int j = start ; j<= end;j++){
                    System.out.print(j + "*" + i + "=" + i*j+" | ");
                }
                System.out.println("\n");
            }
        }
        public static void main(String[] args) {
            System.out.print("Enter Start : ");
            int start = sc.nextInt();
            System.out.print("Enter End :");
            int end = sc.nextInt();
            print_table(start, end);
        }
    } 