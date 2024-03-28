// a number if sunny number, if n+1 is a perfect square
import java.util.*;
public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        isSunnyNumber(n);
        sc.close();
    }
    static boolean findPerfectSquare(double num){
        double square_root = Math.sqrt(num);
        return ((square_root - Math.floor(square_root)) == 0);
    }
    static void isSunnyNumber(int n){
        if(findPerfectSquare(n+1)){System.out.println("Sunny number");}
        else{System.out.println("Not a sunny number");}
    }
}
