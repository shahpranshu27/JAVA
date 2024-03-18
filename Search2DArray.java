import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {12,23,34},
            {35,46,43,76},
            {98,70,4,67},
            {567,87}
        };
        int target = 76;
        int[] ans = search(arr, target); // format of answer : {row, col}
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j]){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}