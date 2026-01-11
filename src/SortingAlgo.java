import java.util.Arrays;

public class SortingAlgo {
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        countingSort(arr);
    }

    // -- Bubble Sort
    // LARGEST ELEMENTS ARE PUSHED TO THE BACK OF THE ARRAY
    // Time Complexity = O(N^2) {not best}
    static void BubbleSort(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // -- Selection Sort
    // SMALLEST ELEMENTS ARE PUSHED TO THE STARTING OF THE ARRAY
    // Time Complexity = O(N^2) {Same as Bubble Sort}
    static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[minPos]>arr[j]){
                    minPos =j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

    // Insertion Sort
    // elements are picked and kept at the position they should be in
    // time complexity is O(N^2)
    static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 &&arr[prev]>curr){
                arr[prev+1] =arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        System.out.println(Arrays.toString(arr));
    }

    // There is an inbuilt sorting Algorithm -- Arrays.sort(arr)
    // time complexity O(NlogN)


    // Counting Sort
    // in counting sort we count the individual numbers recurrence and save them in a new Array
    // Then we will sort them according to there total recurrence

    static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j =0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
