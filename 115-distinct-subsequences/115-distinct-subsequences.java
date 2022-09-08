class Solution {
    public int solve(String s, String r, int index1, int index2, int[][] dp){
        if(index2<0) return 1;
        if(index1<0) return 0;
        if(dp[index1][index2]!=-1) return dp[index1][index2];
        if(s.charAt(index1)==r.charAt(index2)) return dp[index1][index2]=solve(s, r, index1-1, index2-1, dp)+solve(s,r, index1-1, index2, dp);
        
        return dp[index1][index2]=solve(s, r, index1-1, index2, dp);
    }
    public int numDistinct(String s, String t) {
        int dp[][]=new int[s.length()][t.length()];
        
        for(int arr[]: dp) Arrays.fill(arr, -1);
        
        return solve(s, t, s.length()-1, t.length()-1, dp);
    }
}