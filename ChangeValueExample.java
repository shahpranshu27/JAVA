import java.util.Arrays;

public class ChangeValueExample {
    public static void main(String[] args) {
        // creating an array
        int[] arr = {1,2,4,65,76};
        change(arr);
        System.out.println(Arrays.toString(arr));
        // since arrays are mutable, the value passed in function is passed by value, and the copy only is passed. but due t it's mutable property, the values can be changed, and it gets reflected to the main array itself, unlike String. 
        // Strings are immutable data types, so when it is passed into a method, the copy of String is passed into it, and it doesn't change the original value, instead it creates a new object in that particular method.
    }

    static void change(int[] arr){
        arr[0] = 97;
    }
}
