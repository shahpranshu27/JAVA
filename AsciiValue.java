import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'j';
        System.out.println("ASCII value of "+c1+" is: "+(int)(c1));
        System.out.println("ASCII value of "+c2+" is: "+(int)(c2));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter either a Capital or small case letter: ");
        char c3 = sc.next().charAt(0);
        System.out.println("ASCII value of "+c3+" is: "+(int)(c3));
        sc.close();
    }
}
