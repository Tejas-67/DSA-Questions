class Solution {
    public int solve(String s,String r, int index1, int index2, int[][] dp){
        if(index1<0 || index2<0) return 0;
        
        if(dp[index1][index2]!=-1) return dp[index1][index2];
        
        if(s.charAt(index1)==r.charAt(index2)) return dp[index1][index2]=1+solve(s,r, index1-1, index2-1, dp);
        int hold1=solve(s,r, index1, index2-1, dp);
        int hold2=solve(s,r, index1-1, index2, dp);
        
        return dp[index1][index2]=Math.max(hold1, hold2);
    }
    public int minInsertions(String s) {
        String r="";
        for(int i=s.length()-1;i>-1;i--) r+=s.charAt(i);
        int dp[][]=new int[s.length()][s.length()];
        for(int arr[]: dp) Arrays.fill(arr, -1);
        return s.length()-solve(s,r, s.length()-1, s.length()-1, dp);
    }
}