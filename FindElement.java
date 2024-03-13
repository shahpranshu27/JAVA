import java.util.Scanner;

public class FindElement {
    static int findElement(int arr[], int n, int key){
        for(int i=0; i<n; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12,23,34,45,56};
        int n = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to check: ");
        int key = sc.nextInt();

        int position = findElement(arr, n, key);
        if(position == -1){
            System.out.println("Element not found!");
        }
        else{
            System.out.println("Element found at index: "+position);
        }
        sc.close();
    }    
}