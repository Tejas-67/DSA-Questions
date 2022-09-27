class Solution {
    public int solve(int arr[], int index, int dp[], int k){
        if(index>arr.length-1) return 0;
        
        if(dp[index]!=-1) return dp[index];
        
        int currmax=arr[index];
        int len=0;
        int ans=0;
        for(int i=index;i<Math.min(arr.length, index+k);i++){
            len++;
            currmax=Math.max(currmax, arr[i]);
            ans=Math.max(ans, currmax*len + solve(arr, i+1, dp, k));
            
        }
        return dp[index]=ans;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
       int dp[]=new int[arr.length+1];
       Arrays.fill(dp, -1);
        
        return solve(arr, 0, dp, k);
    }
}