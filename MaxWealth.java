public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,3,4},
            {2,5,12},
            {6,6,5}
        };
        System.out.println(maxWealth(accounts));
    }

    static int maxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // now we have sum of accounts of each and every person
            if (sum>ans) {
                ans = sum;
            }
        }
        return ans;
    }
}