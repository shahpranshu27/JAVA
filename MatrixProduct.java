public class MatrixProduct {
    public static void main(String[] args) {
        int row1, row2, col1, col2;

        int[][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] b = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        row1 = a.length;
        row2 = b.length;
        col1 = a[0].length;
        col2 = b[0].length;

        if(col1 != row2){
            System.out.println("Matrices can not be multiplied!");
        }
        else{
            int[][] prod = new int[row1][col2]; // because we want to multiply row1 of matrix a, and col2 of matrix b
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < row2; k++) {
                        prod[i][j] = prod[i][j]+(a[i][k] * b[k][j]);
                    }
                }
            }
            System.out.println("Product of 2 matrices are: ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(prod[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
