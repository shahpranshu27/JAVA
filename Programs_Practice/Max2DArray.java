public class Max2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {12,23,34},
            {35,46,43,76},
            {98,70,4,67},
            {567,87}
        };
        System.out.println(max(arr));
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}