import java.lang.Math;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        int myNum = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int userNum = 0;
        int cnt = 0;
        do{
            System.out.println("Guess the number (from 1-100) : ");
            userNum = sc.nextInt();
            if(userNum == myNum){
                cnt+=1;
                System.out.println("Correct!!");
                System.out.println("You guessed in : "+cnt+" tries");
                break;
            }
            else if(userNum>myNum){
                cnt+=1;
                System.out.println("Number you guessed is too large!");
            }
            else{
                cnt+=1;
                System.out.println("Number you guessed is too small!");
            }
        }
        while(userNum>=0);
        System.out.println("My number was : "+myNum);
        sc.close();
    }
}
