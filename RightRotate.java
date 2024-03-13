public class RightRotate {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int n = 3; // n-> number of right shits/rotates in the array

        System.out.println("Original array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        // rotating the given array by n right shifts
        for(int i=0; i<n; i++){
            int j,last;
            last = arr[arr.length-1];
            for(j=arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println();
        System.out.println("After right rotating: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}