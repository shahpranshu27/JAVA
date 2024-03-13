import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a fruit: ");
        String fruit = sc.next();

        switch (fruit) {
            case "mango":
                System.out.println("Mango is the KING of fruits");
                break;
            case "apple":
                System.out.println("an apple a day, keeps the doctor away!!");
                break;
            case "orange":
                System.out.println("is there a difference between an orange and a tangerine? BTW we call an orange a tangerine, and a tangerine and orange 😂 ");
                break;
            default:
                System.out.println("enter a valid fruit...");
                break;
        }
    }
}
