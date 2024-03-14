public class InsertAtAnyPosition {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 6;
        arr[3] = 2;
        arr[4] = 74;
        arr[5] = 98;
        int n=5;
        int x=10, pos=2;
        System.out.println("Before insertion: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insertPosition(arr, n, x, pos);
        n+=1;
        System.out.println("After insertion: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void insertPosition(int arr[], int n, int x, int pos){
        for(int i=n-1; i>=pos; i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = x;
    }
}