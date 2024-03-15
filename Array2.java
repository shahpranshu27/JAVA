
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of cols: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // int[][] arr1 = {
        //     {1, 2, 3},
        //     {4, 5},
        //     {7, 8, 9, 10}
        // };

        // for(int i=0; i<arr1.length; i++){
        //     for(int j=0; j<arr1[i].length; j++){
        //         System.out.print(arr1[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        sc.close();
    }
}
