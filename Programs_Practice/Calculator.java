import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ans = 0;
        while(true){
            System.out.println("Enter operator: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter a: ");
                int a = sc.nextInt();
                System.out.println("Enter b: ");
                int b = sc.nextInt();

                if(op == '+'){ans = a+b;}
                else if(op == '-'){ans = a-b;}
                else if(op == '*'){ans = a*b;}
                else if(op == '/'){if(b!=0){ans = a/b;}}
                else if(op == '%'){ans = a%b;}
                else{System.out.println("Wrong input!");}
            }
            else if(op == 'x' || op == 'X'){break;}
            else{System.out.println("Invalid operator");}
            System.out.println("Result : "+ans);
        }
        sc.close();
    }
}
