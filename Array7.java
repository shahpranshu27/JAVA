public class Array7 {
    public static void main(String[] args) {
        // max in the given array
        int[] arr = {1,2,3,6,4,67,87,43,59,90};
        int max = arr[0];

        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println("max: "+max);

        // to find max element in a given range
        for (int i = 1; i < 8; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max: "+max);
    }
}
