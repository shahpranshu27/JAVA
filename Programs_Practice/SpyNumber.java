// a number whose digit's sum and product are sum, is called spy number
import java.util.*;
public class SpyNumber {
    public static boolean isSpyNumber(int num){
        int product=1, sum=0, lastDigit;
        while(num>0){
            lastDigit = num%10;
            sum+= lastDigit;
            product*= lastDigit;
            num/=10;
        }
        // if(sum == product){System.out.println("Spy number!");}
        // else{System.out.println("Not a spy number!!");}
        if(sum == product){return true;}
        else{return false;}
    }
    public static void main(String[] args) {
        int lowerBound=0, upperBound=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower bound : ");
        lowerBound= sc.nextInt();
        System.out.println("Enter upper bound : ");
        upperBound= sc.nextInt();

        for(int i=lowerBound; i<upperBound; i++){
            if(isSpyNumber(i))
            System.out.println(i+" ");
        }
        sc.close();
    }
}
