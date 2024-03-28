// factorial sum of all it's digits = number itself
import java.util.*;

public class KrishnamurthyNumber {
    public static void main(String[] args) {
        int range;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        range = sc.nextInt();
        for(int i=1; i<=range; i++){
            checkNumber(i);
        }
        sc.close();
    }
    static int fact(int num){
        int f = 1;
        while(num!=0){
            f*=num;
            num--;
        }
        return f;
    }

    static void checkNumber(int num){
        int sum = 0;
        int tempNumber = num;

        while(tempNumber!=0){
            sum+= fact(tempNumber%10);
            tempNumber /= 10;
        }
        if(sum==num){
            System.out.println(num+" is a krishnamurthy number");
        }
    }
}
