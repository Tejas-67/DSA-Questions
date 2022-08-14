class Solution {
    public int getMaximumGenerated(int n) {
        if(n<2) return n;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        int max=Integer.MIN_VALUE;
        for(int i=2;i<n+1;i++){
            if(i%2==0) dp[i]=dp[i/2];
            else dp[i]=dp[i/2]+dp[1+ i/2];
            max=Math.max(dp[i], max);
        }
       // Arrays.sort(dp);
        return max;
    }
}