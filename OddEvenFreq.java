public class OddEvenFreq {
    public static void main(String[] args) {
        int rows, cols;
        int[][] a = {
            {4,1,3},
            {3,5,7},
            {8,2,6}
        };

        int cntOdd = 0;
        int cntEven = 0;

        rows = a.length;
        cols = a[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(a[i][j] % 2 == 0){cntEven+=1;}
                else{cntOdd+=1;}
            }
        }
        System.out.println("Even numbers in array: "+cntEven);
        System.out.println("Odd numbers in array: "+cntOdd);
    }
}
