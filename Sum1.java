import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 and num2: ");    
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum of 2 numbers is: "+sum(num1, num2));
        sc.close();
    }

    // passing the int arguements in the method, and returning int value
    static int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}