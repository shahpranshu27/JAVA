import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // sum();
        System.out.println("Sum of 2 numbers : "+sum());
    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        // System.out.println("Sum of 2 numbers: "+(num1+num2)); // if return type is void
        sc.close();
        return (num1+num2); // only if return type is int or float or double or something, then only we use return type 
    }
}
