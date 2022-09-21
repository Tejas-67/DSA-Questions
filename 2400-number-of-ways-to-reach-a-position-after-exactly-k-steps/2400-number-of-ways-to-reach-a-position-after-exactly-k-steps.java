class Solution {
    public int solve(int s, int e, int k, int dp[][]){
        if(s==e && k==0) return 1;
        if(k==0) return 0;
        if(dp[s+1000][k]!=-1) return dp[s+1000][k];
        
        int left=solve(s-1, e, k-1, dp)%(1000000007);
        int right=solve(s+1, e, k-1, dp)%(1000000007);
        
        return dp[s+1000][k]=(left+right)%(1000000007);
    }
    public int numberOfWays(int startPos, int endPos, int k) {
        int dp[][]=new int[3002][k+1];
        for(int arr[]: dp) Arrays.fill(arr, -1);
        
        return solve(startPos, endPos, k, dp);
    }
}