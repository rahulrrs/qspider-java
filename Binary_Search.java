import java.util.*;
public class Binary_Search {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the number to be searcher: ");
        int key = sc.nextInt();
        int result = binarysearch(arr, key);
        if(result == -1){
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Element found at index: " + result);
        }

    }
    public static int binarysearch(int[] arr, int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}