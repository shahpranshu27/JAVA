public class Largest {
    public static void main(String[] args) {
        int[] arr = {8,4,6,3,0,1,7,2,9};
        System.out.println("Largest element: "+largest(arr));
    }

    static int largest(int[] arr){
        int temp;
        // sorting array in descending order, and returning arr[0] which will be largest element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr[0];
    }
}