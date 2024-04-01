package leetcode;
// 1365 : how many numbers are smaller than the current number
import java.util.Arrays;

public class SmallerNumber {
    static int[] small(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] < arr[i] && j!=i){
                    count++;
                }
                arr1[i] = count;
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        // int[] arr = {8,1,2,2,3};
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(small(arr)));
    }
}
