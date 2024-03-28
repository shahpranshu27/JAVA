// a non-zero number, where the first digit shoul not be 0, amd it should contain atleast 1 zero
import java.util.*;

public class DuckNumber {
    public static boolean checkNumber(int num){
        while(num!=0){
            if(num%10 == 0){ return true;}
            num/=10;
        }
        return false;
    }
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if(checkNumber(n1)){
            System.out.println(n1+" is a Duck number");
        }
        else{
            System.out.println(n1+" is not a Duck number");
        }
        if(checkNumber(n2)){
            System.out.println(n2+" is a Duck number");
        }
        else{
            System.out.println(n2+" is not a Duck number");
        }
        sc.close();
    }
}
