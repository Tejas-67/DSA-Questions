class Solution {
    Set<String> set=new HashSet<>();
    public int solve(String s, int index, int[] dp){
        if(index<0) return 1;
        if(dp[index]!=-1) return dp[index];
        int take1=0, take2=0;
        
        if(set.contains(s.charAt(index)+"")) take1=solve(s, index-1, dp);
        
        if(index-1>=0 && set.contains(s.substring(index-1, index+1))) take2=solve(s, index-2, dp);
        
        
        return dp[index]=take1+take2;
    }
    public int numDecodings(String s) {
        int dp[]=new int[s.length()];
        Arrays.fill(dp, -1);
        for(int i=1;i<27;i++){
            set.add(Integer.toString(i));
        }
        return solve(s, s.length()-1, dp);
    }
}