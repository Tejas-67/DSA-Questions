class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        boolean dp[][]=new boolean[s.length()][s.length()];
        for(boolean arr[]: dp) Arrays.fill(arr, false);
        solve(ans, s, 0, temp, dp);
        
        return ans;
    }
    
    public void solve(List<List<String>> ans, String s, int index, List<String> currlist, boolean dp[][]){
        
        if(index==s.length()) ans.add(new ArrayList<>(currlist));
        
        for(int i=index; i< s.length(); i++){
            if(dp[index][i] || ispalindrome(s.substring(index, i+1))){
                dp[index][i]=true;
                currlist.add(s.substring(index, i+1));
                solve(ans, s, i+1, currlist, dp);
                currlist.remove(currlist.size()-1);
            }
            
            //solve( ans , s, index+1, currlist);
            
            
        }
        
    }
    
    
    public boolean ispalindrome(String s){
        if(s.length()==1) return true;
        
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        
        return true;
    }
}