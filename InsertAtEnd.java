public class InsertAtEnd {
    static int insertEnd(int arr[], int n, int key, int capacity){
        if(n>= capacity){return n;}
        arr[n] = key;

        return (n+1);
    }
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 6;
        arr[3] = 2;
        arr[4] = 74;
        arr[5] = 98;
        int capacity = 20;
        int n = 6;
        int i, key = 45;
        System.out.println("Before insertion: ");
        for(i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        n = insertEnd(arr, n, key, capacity);
        System.out.println("After insertion: ");
        for(i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}