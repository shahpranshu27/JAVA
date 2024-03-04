import java.util.*;
public class Palindrome {
    // static void checkPalindrome(int n){
    //     int r, sum=0, temp;
    //     temp = n;
    //     while(n>0){
    //         r=n%10;
    //         sum=(sum*10)+r;
    //         n=n/10;
    //     }
    //     if(temp==sum){System.out.println("palindrome number");}
    //     else{System.out.println("not a palindrome number");}
    // }
    // public static void main(String[] args) {
    //     checkPalindrome(121);
    //     checkPalindrome(23);
    // }

    public static void main(String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string or number : ");
        original = in.nextLine();
        int length = original.length();
        for(int i=length-1; i>=0; i--){
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        in.close();
    }
}
