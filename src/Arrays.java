public class Arrays {
    public static void main(String[] args){
        int arr[] = {7,1,5,3,6,4};
        int target = 1;
//        if(binarySearch(arr, target) == -1){
//            System.out.println("The number is not present in the array");
//        }else {
//            System.out.println("The number is found at index: " + binarySearch(arr,target));
//        }
        System.out.println(Stocks(arr));
    }
    static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    static int LargestNumber(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int binarySearch(int arr[], int target){
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid] == target){
                    return mid;
                } else if (arr[mid]<target) {
                    start = mid+1;

                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    static int[] reverse(int arr[]){
        int start = 0;
        int end  = arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end] =temp;
            start++;
            end--;
        }
        return arr;
    }
    static void PairArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }
    static void SubArrays(int arr[]){
        int ts = 0;
        for (int i = 0; i < arr.length ; i++) {
            int start = i;
            for (int j = i; j < arr.length ; j++) {
                int end = j;
                for (int k = start; k <=end ; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }

            System.out.println();

        }
        System.out.println("Total Count: " +ts);
    }
    static void MaxSumSubArray(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            int start = i;
            for (int j = i; j <arr.length ; j++) {
                int end = j;
                sum=0;
                for (int k = start; k <=end ; k++) {
                    sum += arr[k];
                }
                System.out.println(sum);
                if(max<sum){
                    max = sum;
                }
            }
        }
        System.out.println("the max sum is: " + max);

    }
    static void PrefixSum(int arr[]){
        int newArr[] = new int[arr.length];
        newArr[0] = arr[0];
        for (int i = 1; i < newArr.length ; i++) {
            newArr[i] = newArr[i-1]+ arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int  curSum =0;
        for (int i = 1; i < arr.length; i++) {
            int start =i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                curSum = start == 0? newArr[end] : newArr[end]- newArr[start-1];

                if(maxSum<curSum){
                    maxSum = curSum;
                }
            }
        }
        System.out.println("Max Sum: " + maxSum );
    }
    static void Kadane(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int curSum =0;
        int nmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            nmax = Math.max(arr[i],nmax);
        }
        if(nmax<0){
            System.out.println("the max sum is: "+nmax);
        } else {
            for (int j : arr) {
                curSum += j;
                if (curSum < 0) {
                    curSum = 0;
                }
                maxSum = Math.max(curSum, maxSum);
            }
            System.out.println("the max sum is: "+maxSum);
        }
    }
    static int Rainwater(int arr[]){

        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }
        int rightMax[] = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1],arr[i]);
        }
        int trappedWater =0;
        for (int i = 0; i < arr.length; i++) {
            int waterLevel =Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel -arr[i];
        }
        return trappedWater;
    }
    static int Stocks(int arr[]){
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                maxPrice = Math.max(maxPrice, arr[j]);
            }
        }
        int profit = maxPrice-minPrice;
        return Math.max(profit, 0);
    }
}
