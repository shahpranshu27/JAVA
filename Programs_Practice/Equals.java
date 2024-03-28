import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of fruit: ");
        String fruit = sc.next();

        if(fruit.equals("mango")){
            System.out.println("King of fruits");
        }
        else if(fruit.equals("apple")){
            System.out.println("An apple a day, keeps the doctor away!");
        }
        else{
            System.out.println("enter the name of fruit!!");
        }
        sc.close();
    }
}
