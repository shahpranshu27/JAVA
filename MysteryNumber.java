// a number, which can be expressed as sum of 2 numbers, and those 2 numbers are in reverse orders i.e. 23 and 32
import java.util.Scanner;
public class MysteryNumber {
    static int reverse(int x)  
    {  
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;
    }  
    static boolean isMysteryNo(int num)
    {
        for(int i=1; i<=num; i++){
            int j=reverse(i);
            if(i+j == num){
                System.out.println(i+" "+j);
                System.out.println(num+" is a mystery number");
                return true;
            }
        }
        System.out.println("The given number is not a mystery number");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        isMysteryNo(num);
        sc.close();
    }
}