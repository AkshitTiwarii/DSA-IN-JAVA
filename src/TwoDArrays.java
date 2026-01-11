import java.util.*;
import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args){
        int matrix[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        SpiralMatrix(matrix);
        
    }
    static String twoArray(int[][] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println(Arrays.deepToString(arr));
        return Arrays.deepToString(arr);
    }
    static void SpiralMatrix(int arr[][]){
        int startRow = 0;
        int endRow = arr.length-1;
        int startCol =0;
        int endCol = arr[0].length;

        while (startRow<=endRow && startCol<=endCol  ){
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
            for (int i =startRow+1 ; i <=endCol ; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            for (int i = endCol-1; i >=startCol ; i--) {
                System.out.print(arr[endRow][i]);
            }
            for (int i = endRow-1; i>= startRow+1; i--) {
                System.out.print(arr[i][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }
}
