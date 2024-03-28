public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{23,45,12,9,67};
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){min = arr[i];}
        }
        System.out.println("min numbers: "+min);
    }
}
