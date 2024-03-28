public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,6,8};
        System.out.println("Second smallest: "+secondSmallest(arr));
    }

    static int secondSmallest(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
    }
}