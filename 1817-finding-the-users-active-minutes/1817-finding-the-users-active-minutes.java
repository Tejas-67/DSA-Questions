class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, HashSet<Integer>> map=new HashMap<>();
        
        for(int arr[]: logs){
            HashSet<Integer> set=map.getOrDefault(arr[0], new HashSet<>());
            set.add(arr[1]);
            map.put(arr[0], set);
        }
        
        int arr[]=new int[k];
        
        for(int ele: map.keySet()){
            if(map.get(ele).size()<=k) arr[map.get(ele).size()-1]++;
        }
        
        return arr;
    }
}