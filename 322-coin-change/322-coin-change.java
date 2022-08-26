class Solution {
    public int solve(int arr[], int index, int amount, int dp[][]){
       // if(amount==0) return 0;
        if(index==0){
           // if(amount==0) return 0;
            //else if(amount>arr[index]) return Integer.MAX_VALUE;
            if(amount%arr[0]==0) return amount/arr[0];
            return (int)Math.pow(10, 9);
                               
        }
        if(dp[index][amount]!=-1) return dp[index][amount];
        
        int take=(int)Math.pow(10, 9);
        int next=solve(arr,index-1,amount, dp);
        if(amount>=arr[index]){
            // int num_of_coins=amount/arr[index];
            take=1+solve(arr, index, amount-arr[index], dp);
        }
        
        return dp[index][amount]=Math.min(take, next);
       // return dp[index][amount];
    }
    public int coinChange(int[] coins, int amount) {
        //Arrays.sort(coins);
        int dp[][]=new int[coins.length][amount+1];
        for(int arr[]: dp) {
            Arrays.fill(arr, -1);}
        
        int ans=solve(coins, coins.length-1, amount, dp);
        if(ans>=(int)Math.pow(10, 9)) return -1;
        return ans;
    }
}