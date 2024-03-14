import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9);
    }

    static void fun(int ...v){ // ...any_char will create an array of integers 
        System.out.println(Arrays.toString(v));
    }
    // for Strings array -> ...anything
    // for char array -> ...anything 
}
