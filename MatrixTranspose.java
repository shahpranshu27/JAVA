public class MatrixTranspose {
    public static void main(String[] args) {
        int rows, cols;
        int[][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        rows = a.length;
        cols = a[0].length;

        System.out.println("original matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        int[][] t = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                t[i][j] = a[j][i];
            }
        }

        System.out.println("Transpose: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}