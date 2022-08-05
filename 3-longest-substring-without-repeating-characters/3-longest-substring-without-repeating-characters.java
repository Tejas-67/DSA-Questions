class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int low=0;
        int high=0;
        HashSet<Character> set=new HashSet<Character>();
        while(high<s.length()){
            char curr=s.charAt(high);
            if(set.contains(curr)){
                set.remove(s.charAt(low));
                low++;
            }
            else{
                set.add(curr);
                ans=Math.max(ans,high+1-low);
                high++;
            }
        }
        
     return ans;
    }
}