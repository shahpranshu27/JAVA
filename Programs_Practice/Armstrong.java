import java.util.*;
import java.lang.Math;
public class Armstrong {
    static boolean isArmstrong(int n){
        int temp, dig=0, last=0, sum=0;
        // assigning n into temp variable
        temp=n;

        // loop executes until condition is true
        while(temp>0){
            temp=temp/10;
            dig++; // to get the total number of digits of the number entered
        }
        temp=n;
        // logic of armstrong number : the number is divided by 10, to get the remainder. that remainder's power is calculated i.e. pow(remainder, digits). then the number is divided by 10 to get the quotient
        while(temp>0){
            last=temp%10;
            sum += (Math.pow(last, dig));
            temp=temp/10; 
        }
        if(n==sum){ return true;}
        else{ return false;}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter the number : "));
        int num = sc.nextInt();
        // if(isArmstrong(num)){
        //     System.out.println("Armstrong");
        // }
        // else{
        //     System.out.println("Not armstrong");
        // }
        for(int i=0; i<num; i++){
            if(isArmstrong(i)){
                System.out.print(i+",");
            }
        }
        sc.close();
    }
}
