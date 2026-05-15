package arrays;

public class Dup {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 5, 2};
        boolean foundDuplicate = false;

        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            if (isFirstDuplicate(arr, i)) {
                System.out.println(arr[i]);
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }
    }

    private static boolean isFirstDuplicate(int[] arr, int index) {
        boolean appearsBefore = false;
        boolean appearsAfter = false;

        for (int i = 0; i < index; i++) {
            if (arr[i] == arr[index]) {
                appearsBefore = true;
                break;
            }
        }

        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] == arr[index]) {
                appearsAfter = true;
                break;
            }
        }

        return !appearsBefore && appearsAfter;
    }
}
