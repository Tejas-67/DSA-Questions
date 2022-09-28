class Solution {
    public boolean solve(String s, String p, int index1, int index2, Boolean dp[][]){
        if(index1<0 && index2<0) return true;
        if(index2<0 && index1>=0) return false;
        if(index1<0 && index2>=0){
            for(int i=0;i<=index2;i++){
                if(p.charAt(i)!='*') return false;
                
                
            }
            return true;
        }
        if(dp[index1][index2]!=null) return dp[index1][index2];
        
        if(s.charAt(index1)==p.charAt(index2) || p.charAt(index2)=='?') return dp[index1][index2]=solve(s,p, index1-1, index2-1, dp);
        
        if(p.charAt(index2)=='*'){
            return dp[index1][index2]=solve(s,p, index1-1, index2, dp)|| solve(s,p, index1, index2-1, dp);
        }
        return dp[index1][index2]=false;
    }
    public boolean isMatch(String s, String p) {
        
        Boolean dp[][]=new Boolean[s.length()][p.length()];
        for(Boolean arr[]: dp) Arrays.fill(arr, null);
        
        return solve(s, p, s.length()-1, p.length()-1, dp);
    }
}