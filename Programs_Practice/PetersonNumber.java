// A number is said to be Peterson number if sm of factorials of each digit = to the number itself 
import java.util.*;

public class PetersonNumber {
    static long[] factorial = new long[]{1,1,2,6,24,120,720,5040,40320,362880,3628800,39916800,479001600};    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(isPeterson(n)){System.out.println(n+" is a peterson number");}
        else{System.out.println(n+" is not a peterson number");}
        sc.close();
    }
    static boolean isPeterson(int n){
        int num = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum += factorial[digit];
            n/=10;
        }
        return(sum==num);
    }
}