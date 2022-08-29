class Solution {
    public int lcsUtil(String s1, String s2, int ind1, int ind2, int[][] dp){

    if(ind1<0 || ind2<0)
        return 0;
        
    if(dp[ind1][ind2]!=-1)
        return dp[ind1][ind2];
    
    if(s1.charAt(ind1) == s2.charAt(ind2))
        return dp[ind1][ind2] = 1 + lcsUtil(s1,s2,ind1-1,ind2-1,dp);
    
    else 
        return dp[ind1][ind2] = 0 + Math.max(lcsUtil(s1,s2,ind1,ind2-1,dp),
        lcsUtil(s1,s2,ind1-1,ind2,dp));
   
}

    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];
        for(int arr[]: dp) Arrays.fill(arr,-1);
        
        return lcsUtil(text1, text2, text1.length()-1, text2.length()-1, dp);
    }
}