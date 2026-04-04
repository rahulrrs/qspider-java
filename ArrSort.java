public class ArrSort {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 3, 0, 0, 1, 0, 4, 0, 0 },
                { 1, 2, 3, 5, 6 }
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(arr[j] + " ");
            }

        }
    }
}