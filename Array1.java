import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }

        // for loop can be enhanced in the below way
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
