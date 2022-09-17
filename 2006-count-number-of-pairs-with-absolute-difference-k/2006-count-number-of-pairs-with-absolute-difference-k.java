class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int ele: nums){
            map.put(ele,map.getOrDefault(ele, 0)+1);
            set.add(ele);
        }
        
        int ans=0;
        for(int ele: set){
            if(map.containsKey(ele+k)){
                ans+=map.get(ele)*map.get(ele+k);
                
            }
            if(map.containsKey(ele-k)){
                ans+=map.get(ele)*map.get(ele-k);
                
            }
            map.remove(ele);
            
        }
        
        return ans;
        
    }
}