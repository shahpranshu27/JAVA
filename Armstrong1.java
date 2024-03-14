import java.util.Scanner;

public class Armstrong1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum=0; 
        int numDigits = (int)(Math.log10(original)+1);
        while(n>0){
            int rem = n%10;
            n=n/10;
            sum+= Math.pow(rem, numDigits);
        }

        return (sum==original);
    }
}