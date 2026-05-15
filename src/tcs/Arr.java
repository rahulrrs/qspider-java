package tcs;

public class Arr {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, 3, 2};

        System.out.println("Unique elements:");
        for (int i = 0; i < arr.length; i++) {
            boolean alreadyPrinted = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                System.out.println(arr[i]);
            }
        }
    }
}
