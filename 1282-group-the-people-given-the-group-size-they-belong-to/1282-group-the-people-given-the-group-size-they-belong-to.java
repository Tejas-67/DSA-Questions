class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map=new HashMap<>();
        
        for(int i=0;i<groupSizes.length;i++){
            List<Integer> list=map.getOrDefault(groupSizes[i], new ArrayList<>());
            
            list.add(i);
            
            map.put(groupSizes[i], list);
        }
        
        
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int ele: map.keySet()){
            List<Integer> currlist=map.get(ele);
            int pos=0;
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<currlist.size();i++){
                if(i%ele!=0){
                    list.add(currlist.get(i));
                   // pos++;
                }
                else{
                    ans.add(list);
                    list.clear();
                    list.add(currlist.get(i));
                }
            }
            
        }
        
        return ans;
    }
}