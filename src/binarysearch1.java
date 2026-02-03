// Time Complexity of Binary Search is o(LongN)

public class binarysearch1 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 3;
        if(check(arr,target) == -1){
            System.out.println("Not found");
        }
        else {
            System.out.println("Found at index : "+check(arr,target));
        }

    }
    static int check(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (end+start)/2;
            if(target == arr[mid]){
                return mid;
            } else if (arr[mid]>target) {
                end = mid-1;

            }
            else {
                start = mid+1;
            }

        }
        return -1;
}}
