import java.util.Scanner;

public class IntToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);
        System.out.println("Binary representation of "+num+" is: "+binary);

    }
}
