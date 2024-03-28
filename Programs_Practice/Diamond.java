import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        int row, space=1;
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        space = row-1;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            space--;
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        space=1;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            space++;
            for(int j=1; j<=2*(row-i)-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
