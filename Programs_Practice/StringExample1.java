import java.util.Scanner;

public class StringExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(myGreet(name)); // if want to take name through user
        System.out.println(myGreet("Pranshu shah")); // if directly want to pass the name as an arguement
        sc.close();
    }

    static String myGreet(String name){
        return "Hello "+ name;
    }
}
