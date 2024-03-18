public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {23,45,321,424,43};
        System.out.println("Second largest: "+secondLargest(arr));
    }

    static int secondLargest(int[] arr){
        int temp = 0;
        // sorting array in descending order, and then returning arr[1]
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr[1];
    }
}