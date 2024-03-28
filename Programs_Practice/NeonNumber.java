// a number whose sum of digits of it's sqaure = number itself
import java.util.*;
public class NeonNumber {
    public static void main(String[] args) {
        int sum=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();

        int square = n*n;
        while(square!=0){
            int digit = square%10;
            sum+= digit;
            square/=10;
        }
        if(sum == n){System.out.println(n+" is a neon number");}
        else{System.out.println(n+" is not a neon number");}
        sc.close();
    }
}
