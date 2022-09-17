class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();
        
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int ans=0;
        for(String ele: words){
            boolean flag=true;
           // Set<Character> set=new HashSet<>();
            for(int i=0;i<ele.length();i++){
                if(set.contains(ele.charAt(i))==false){
                    flag=false;
                    break;
                }
            }
            if(flag) ans++;
        }
        
        return ans;
    }
}