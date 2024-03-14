import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun(1,2,3,4,5,6,7,8,9);
        multiple(23, 540, "Pranshu", "Yashvi", "Siddh", "Siddhi");
    }
    // Note: variable length arguements should always come at the end
    static void fun(int ...v){ // ...any_char will create an array of integers 
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...s){
        System.out.print(a+" "+b+" "+Arrays.toString(s));
        // System.out.println(Arrays.toString(s));
    }
    // for Strings array -> ...anything
    // for char array -> ...anything 
}
