public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,2,4,3,5,4,6,5,1};
        System.out.print("duplicate elements in given array are: ");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
