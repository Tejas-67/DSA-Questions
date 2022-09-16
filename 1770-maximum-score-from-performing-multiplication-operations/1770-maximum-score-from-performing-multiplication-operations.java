class Solution {
    int n, m;
    public int maximumScore(int[] nums, int[] multipliers) {
        n=nums.length;
        m=multipliers.length;
        
//         int dp[][]=new int[m][m];
        
//         for(int arr[]: dp) Arrays.fill(arr, -1);
        return solve(0, 0, new Integer[m][m], nums, multipliers);
    }
    
    public int solve(int start, int index, Integer dp[][], int nums[], int mul[]){
        if(index>m-1) return 0;
        
        if(dp[start][index]!=null) return dp[start][index];
        
        int takefirst=mul[index]*nums[start] + solve(start+1, index+1, dp, nums, mul);
        
        int takelast=mul[index]*nums[n-1-(index-start)] + solve(start, index+1, dp, nums, mul);
        
        return dp[start][index]=Math.max(takefirst, takelast);
    }
}