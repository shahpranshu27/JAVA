// a number that ends with 7 or is divisible by 7, is called buzz number
import java.util.*;
// import java.io.*;
public class BuzzNumber {
    static boolean checkNumber(int num){
        if(num%7 == 0 || num%10 == 7){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        n1 = sc.nextInt();
        System.out.println("Enter num2: ");
        n2 = sc.nextInt();

        if(checkNumber(n1)){
            System.out.println(n1+" is a Buzz number");
        }
        else{
            System.out.println(n1+" is not a Buzz number");
        }
        if(checkNumber(n2)){
            System.out.println(n2+" is a Buzz number");
        }
        else{
            System.out.println(n2+" is not a Buzz number");
        }
    }
}
