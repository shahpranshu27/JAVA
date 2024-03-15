import java.util.Arrays;

public class Array8 {
    public static void main(String[] args) {
            // swapping in arrays
        int[] arr = {1,2,3,4,5,6};
        int len = arr.length;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < len/2; i++) {
            swap(arr, i, len-i-1);
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
