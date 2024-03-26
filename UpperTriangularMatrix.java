public class UpperTriangularMatrix {
    public static void main(String[] args) {
        int rows, cols;
        int[][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        rows = a.length;
        cols = a[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(j<i){System.out.print("0 ");}
                else{
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
