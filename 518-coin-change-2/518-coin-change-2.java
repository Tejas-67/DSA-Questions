class Solution {
    public int solve(int arr[], int amount, int index, int[][] dp){
        if(amount==0) return 1;
        if(dp[index][amount]!=-1) return dp[index][amount];
        if(index==0){
            if(amount%arr[index]==0) return 1;
            else return 0;
        }
        int next=solve(arr, amount, index-1, dp);
        int take=0;
        if(arr[index]<=amount) take=solve(arr, amount-arr[index], index, dp);
        return dp[index][amount]=take+next;
        
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int arr[]: dp) Arrays.fill(arr, -1);
        return solve(coins, amount, n-1, dp);
    }
}