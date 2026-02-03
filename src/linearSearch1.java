public class linearSearch1 {
    public static void main(String[] args){
        int nums[] = {5,7,9,11,13};
        int target = 11;
        if(check(nums,target) == -1){
            System.out.println("Not Found");
        }else {
            System.out.println("Found in array" );
        }
    }
    static int check(int arr[], int target){
        for (int num :arr){
            if( num ==target){
                return num;
            }
        }
        return -1;
    }
}
