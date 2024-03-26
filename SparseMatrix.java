public class SparseMatrix {
    public static void main(String[] args) {
        int rows, cols, size, cnt = 0;

        int[][] a = {
            {4,0,0},
            {0,5,0},
            {0,0,6}
        }; // this is a sparse matrix
        // int[][] a = {
        //     {4,1,3},
        //     {0,5,0},
        //     {0,0,6}
        // }; // this is not a sparse matrix

        rows = a.length;
        cols = a[0].length;

        size = rows * cols;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(a[i][j] == 0){cnt++;}
            }
        }

        if(cnt > (size/2)){
            System.out.println("sparse matrix!");
        }
        else{
            System.out.println("not a sparse matrix!");
        }

    }
}
