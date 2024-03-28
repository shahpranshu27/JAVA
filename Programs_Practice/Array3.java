public class Array3 {
    public static void main(String[] args) {
        // dynamic memory allocation
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
    }
}
