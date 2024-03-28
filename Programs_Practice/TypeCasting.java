import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float num = sc.nextFloat();
        // System.out.println(num);

        // gives an error when we need int, and float is provided
        // int num = sc.nextInt();
        // System.out.println(num);

        int num = (int)(67.45f); // gives and error as we are providing float value to int. so we will type cast it into int
        System.out.println(num); // it will give only the int part of the float number

        // automatic type promotion in expression
        int a = 258;
        byte b = (byte)(a);
        System.out.println(b); // it will divide the int number by the max possible value of int range, and provide the remainder i.e. 258%256
        sc.close();
    }
}
