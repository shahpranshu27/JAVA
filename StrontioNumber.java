// a 4 digit number when multiplied by 2, has same digit on tens and hundreds place
import java.util.*;

public class StrontioNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number : ");
        int num = sc.nextInt();
        if((num>999)&&(num<10000)){
            int n = num;
            num*=2;
            num/=10;
            num%=100;
            if((num/10)==(num%10)){System.out.println(n +" is a strontio number");}
            else{System.out.println(n+" is not a strontio number");}
        }
        else{
            System.out.println("Enter a 4 digit number");
        }
    }    
}
