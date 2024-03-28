public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,2354,2,456,7,34};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int cnt = 0;

        for(int num:nums){
            if(even(num)){cnt++;}
        }
        return cnt;
    }

    // function to check if number contains even digits or not
    static boolean even(int num) {
        int noOfDigits = digits(num);
        if(noOfDigits%2 == 0){return true;}
        return false;
    }

    static int digits(int num){
        return (int)(Math.log10(num)+1);
        // int count=0;
        // while(num>0){
        //     count++;
        //     num/=10;
        // }
        // return count;
    }
}