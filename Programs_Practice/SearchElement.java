public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int key = 3;
        int low=0, high=arr.length-1;
        System.out.println("index: "+binarySearch(arr, low, high, key));
    }

    static int binarySearch(int[] arr, int low, int high, int key){
        if(high<low){return -1;}
        int mid = (low+high)/2;
        if(key == arr[mid]){
            return mid;
        }
        if(key>arr[mid]){
            return binarySearch(arr, (mid+1), high, key);
        }
        return binarySearch(arr, low, (mid-1), key);
    }
}