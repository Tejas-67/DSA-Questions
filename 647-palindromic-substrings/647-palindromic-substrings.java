class Solution {
    public boolean check(boolean dp[][], int b, int e, String s){
        if(b<e==false) return true;
        if(s.charAt(b)!=s.charAt(e)) return dp[b][e]=false;
        return dp[b][e]=check(dp,b+1, e-1, s);
    }
    public int countSubstrings(String s) {
        boolean dp[][]=new boolean[s.length()][s.length()];
        
//         for(int i=0;i<s.length();i++){
//             dp[i][i]=true;
            
//         }
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(check(dp, i,j,s)) ans++;
            }
            
        }
        
        return ans+s.length();
    }
}