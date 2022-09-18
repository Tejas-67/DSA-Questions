class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> map=new HashMap<>();
        for(List<String> ll: paths){
            String c=ll.get(0);
            String cc=ll.get(1);
            
            map.put(c, map.getOrDefault(c, 1)+1);
            map.put(cc, map.getOrDefault(cc,0));
        }
        String ans="";
        for(String ele: map.keySet()){
            if(map.get(ele)==0){
                ans=ele;
                break;
            }
        }
        
        return ans;
    }
}