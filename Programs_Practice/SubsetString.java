public class SubsetString {
    public static void main(String[] args) {
        String str = "FUN";
        int len = str.length();
        int temp = 0;

        // total possible subsets are of size : n*(n+1)/2
        String[] arr = new String[len*(len+1)/2];

        // maintains string character
        for (int i = 0; i < len; i++) {
            // adds the next character every iteration 
            for (int j = i; j < len; j++) {
                arr[temp] = str.substring(i, j+1);
                temp++;
            }
        }

        System.out.println("all substrings of "+str+" are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
