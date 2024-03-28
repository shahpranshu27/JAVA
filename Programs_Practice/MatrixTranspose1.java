import java.util.Scanner;
// this is a different approach to transpose the matrix, without the predefined elements, we are taking the elements throught user
public class MatrixTranspose1 {
    public static void main(String[] args) {
        int i, j;
        System.out.println("enter total rows and cols : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.print("enter matrix: ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(" ");
            }
        }

        System.out.println("Original matrix before transpose: ");
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("MAtrix after transpose: ");
        for ( i = 0; i < row; i++) {
            for( j=0; j<col; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
