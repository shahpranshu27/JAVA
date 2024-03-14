public class DeleteOperation {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int key = 4;

        System.out.println("Before deleting: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        n = deleteElement(arr, n, key);

        System.out.println("After deleting: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int findElement(int arr[], int n, int key){
        for(int i=0; i<n; i++){
            if(arr[i] == key){return i;}
        }
        return -1;
    }

    static int deleteElement(int arr[], int n, int key){
        int pos = findElement(arr, n, key);
        if(pos == -1){
            System.out.println("Element not found!");
            return n;
        }

        for(int i=pos; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        return n-1;
    }
}