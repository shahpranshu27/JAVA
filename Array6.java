import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        // swapping in arrays
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
