class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Map<Integer, List<Integer>> map=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            int entry=arr[i]-x;
            if(entry<0) entry*=-1;
            
            List<Integer> list=map.getOrDefault(entry, new ArrayList<>());
            
            list.add(i);
            map.put(entry, list);
        }
        
        List<Integer> ans=new ArrayList<>();
        int pos=0;
        for(int ele: map.keySet()){
            List<Integer> list=map.get(ele);
            boolean flag=false;
            for(int index: list){
                if(pos==k){
                    flag=true;
                    break;
                } 
                //if(ans.size()==0) ans.add(arr[index]);
                 ans.add( arr[index]);
                pos++;
            }
            if(flag) break;
        }
        Collections.sort(ans);
        return ans;
    }
}