import java.util.Arrays;

public class ChangeValueExample {
    public static void main(String[] args) {
        // creating an array
        int[] arr = {1,2,4,65,76};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0] = 97;
    }
}
