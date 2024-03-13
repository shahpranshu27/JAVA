import java.util.Scanner;
public class ReverseRecursion {
    public static void reverseNum(int n){
        if(n<10){
            System.out.print(n);
            return;
        }
        else{
            System.out.print(n%10);
            reverseNum(n/10);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Reverse is : ");
        reverseNum(num);
        sc.close();
    }
}
