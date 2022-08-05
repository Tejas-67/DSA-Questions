class Solution {
    int dp[];
    //memoization
    public int combinationSum4(int[] nums, int target) {
        dp=new int[target+1];
        Arrays.fill(dp,-1);
        dp[0]=1;
        helper(nums,target);
         return dp[target];
    }
    public int helper(int arr[],int target){
        if(dp[target]!=-1) return dp[target];
        int ans=0;
        for(int ele:arr){
          if(ele<=target) ans+=helper(arr,target-ele);
        }
        dp[target]=ans;
        return dp[target];
    }
}