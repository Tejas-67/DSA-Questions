class Solution {
    public List<String> generateParenthesis(int n) {
        List<HashSet<String>> set=new ArrayList<>();
        HashSet<String> hset=new HashSet<>();
        hset.add("()");
        set.add(hset);
        for(int i=1;i<n;i++){
            HashSet<String> currset=new HashSet<>();
            HashSet<String> temp=set.get(i-1);
            for(String ele: temp){
                for(int index=0;index<ele.length();index++){
                    currset.add(ele.substring(0,index+1)+"()"+ele.substring(index+1));
                }
            }
            
            set.add(currset);
        }
        
        List<String> ans=new ArrayList<>(set.get(set.size()-1));
        return ans;
    }
}