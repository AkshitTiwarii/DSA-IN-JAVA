import java.lang.reflect.Array;
import java.util.Arrays;

public class sorting1 {
    public static void main(String[] args){
        int arr[] = {5,6,2,3,1};
        insertion(arr);
    }
    // O(n^2)
    static void bubble(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;  // assume first element is minimum

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                j= j-1;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
    // Time complexity = O(n log n) (best and average case)
    // Worst = O(n^2)
    static void quicksort() {

        // Divide and Conquer - Divide the problem in multiple things, solve them, then combine them
        // Recursion - Using the same function inside the function itslef
        // pivot
    }
}
