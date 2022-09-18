class Solution {
    public int countPoints(String rings) {
        Map<Integer, Set<Character>> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<rings.length()-1;i+=2){
            int pos=rings.charAt(i+1);
            char colour=rings.charAt(i);
            Set<Character> currset=map.getOrDefault(pos, new HashSet<>());
            currset.add(colour);
            map.put(pos, currset);
        }
        
        for(int ele: map.keySet()){
            if(map.get(ele).size()==3) ans++;
        }
        
        return ans;
    }
}