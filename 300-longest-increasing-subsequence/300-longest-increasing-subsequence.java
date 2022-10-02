class Solution {
    public int solve(int arr[], int index, int prev, int dp[][]){
        if(index>=arr.length) return 0;
        
        if(dp[index][prev+10002]!=-1) return dp[index][prev+10002];
        
        int take=Integer.MIN_VALUE;
        if(arr[index]>prev) take=solve(arr,index+1, arr[index], dp)+1;
        
        int next=solve(arr, index+1, prev, dp);
        
        return dp[index][prev+10002]=Math.max(take, next);
    }
    public int lengthOfLIS(int[] nums) {
        
        int max=0;
        for(int ele: nums) max=Math.max(max, ele);
        int dp[][]=new int[nums.length][max+10003];
        
        for(int arr[]: dp) Arrays.fill(arr, -1);
        
        return solve(nums, 0, -10002, dp);
    }
}