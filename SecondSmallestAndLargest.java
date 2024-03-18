public class SecondSmallestAndLargest {
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,6,8,3};
        int n = arr.length;
        secondSmallestAndLargest(arr, n);
    }

    public static void secondSmallestAndLargest(int[] arr, int n){
        if(n==0 || n==1){
            System.out.println(-1+" "+-1+"\n");
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++) {
            small = Math.min(small, arr[i]);
            small = Math.max(large, arr[i]);
        }
        
        for ( i = 0; i < n; i++) {
            // Finding smallest and second smallest
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
    
            // Finding largest and second largest
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            } else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        System.out.println("Second small: "+second_small);
        System.out.println("Second large: "+second_large);
    }
}