public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {12,45,34,76,345,765,856,45635,4353,356,8766};
        System.out.println("Third largest element: "+thirdLargest(arr));

        int[] arr1 = {95,8465,4654,8648,8648,864,683451,86,4186,4,8846,84};
        System.out.println("Third largest: "+thirdLargest(arr1));
    }

    static int thirdLargest(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr[2];
    }
}