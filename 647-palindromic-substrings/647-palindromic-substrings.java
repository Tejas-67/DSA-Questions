class Solution {
    public boolean check(int b, int e, String s){
        if(b<e==false) return true;
        if(s.charAt(b)!=s.charAt(e)) return false;
        return check(b+1, e-1, s);
    }
    public int countSubstrings(String s) {
        // boolean dp[][]=new boolean[s.length()][s.length()];
        
//         for(int i=0;i<s.length();i++){
//             dp[i][i]=true;
            
//         }
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(check( i,j,s)) ans++;
            }
            
        }
        
        return ans+s.length();
    }
}