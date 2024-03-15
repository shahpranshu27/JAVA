
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        // int[][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9, 10}
        };

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
