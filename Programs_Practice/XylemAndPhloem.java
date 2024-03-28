// if the sum of extreme digits = sum of mean digits (numbers in between the extreme digits), it is called Xylem, else Phloem
import java.util.*;

public class XylemAndPhloem {
    public static void main(String[] args) {
        int num, extreme_sum = 0, mean_sum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        num = Math.abs(num); // find absolute number of given number
        n = num;
        sc.close();
        while(n!=0){
            if(n==num || n<10){
                extreme_sum = extreme_sum + n%10;
            }
            else{
                mean_sum = mean_sum + n%10;
            }
            n/=10;
        }
        System.out.println("sum of extreme digits : "+extreme_sum);
        System.out.println("sum of mean digits : "+mean_sum);
        if(extreme_sum == mean_sum){System.out.println(num+" is a xylem number");}
        else{System.out.println(num+" is a phloem number");}
    }
}
