public class InsertElement {
    public static void main(String[] args) {
        // int[] arr = {10,20,30,50,60};
        int[] arr = new int[20];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=50;
        arr[4]=60;
        int capacity = arr.length;
        int n = 5;
        int key = 40;
        System.out.println("Before insertion: ");
        // System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After insertion: ");
        n = insert(arr, n, key, capacity);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static int insert(int[] arr, int n, int key, int capacity) {
        if (n >= capacity) {
            return -1; // Array is full
        }
        int i;
        for (i = n - 1; i >= 0 && arr[i] > key; i--) {
            arr[i + 1] = arr[i]; // Shift elements to the right
        }
        arr[i + 1] = key; // Insert the key
        return (n + 1);
    }    
}