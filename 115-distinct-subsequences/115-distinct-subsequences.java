class Solution {
    public int solve(String s, int index1, int index2, String r, String curr, int dp[][]){
        if(index2<0) return 1;
        if(index1<0) return 0;
        //if(curr.length()>r.length()) return 0;
        if(dp[index1][index2]!=-1) return dp[index1][index2];
        if(curr==r) return 1;
        
        if(s.charAt(index1)==r.charAt(index2)) return dp[index1][index2]=solve(s, index1-1, index2-1, r, s.charAt(index1)+curr, dp)+solve(s, index1-1, index2,r, s.charAt(index1)+curr, dp);
        
        // int holds=solve(s, index1, index2-1, r, curr, dp);
        // int holdr=solve(s, index1-1, index2, r, curr, dp);
        
        return dp[index1][index2]=solve(s, index1-1, index2, r, curr, dp);
    }
    public int numDistinct(String s, String t) {
        int [][]dp=new int[s.length()][t.length()];
        for(int arr[]: dp) Arrays.fill(arr, -1);
        return solve(s, s.length()-1, t.length()-1, t, "", dp);
    }
}