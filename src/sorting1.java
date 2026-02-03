import java.lang.reflect.Array;
import java.util.Arrays;

public class sorting1 {
    public static void main(String[] args){
        int arr[] = {8,6,9,2,4,5};
        bubble(arr);
    }
    static void bubble(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
