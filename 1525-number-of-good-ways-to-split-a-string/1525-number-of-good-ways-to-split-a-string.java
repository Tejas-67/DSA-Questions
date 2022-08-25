class Solution {
    public int numSplits(String s) {
        HashMap<Character, Integer> after=new HashMap<Character, Integer>();
        HashMap<Character, Integer> before=new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            after.put(s.charAt(i), after.getOrDefault(s.charAt(i),0)+1);
            
        }
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            before.put(s.charAt(i), before.getOrDefault(s.charAt(i),0)+1);
            if(after.getOrDefault(s.charAt(i),0)==1) after.remove(s.charAt(i));
            else if(after.getOrDefault(s.charAt(i),0)!=0) after.put(s.charAt(i), after.get(s.charAt(i))-1);
            
            if(before.size()==after.size()) ans++;
        }
        
        return ans;
    }
}