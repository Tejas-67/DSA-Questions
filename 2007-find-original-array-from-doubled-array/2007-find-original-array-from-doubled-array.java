class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2==1) return new int[0];
        int ans[]=new int[changed.length/2];
        
        Map<Integer, Integer> map=new HashMap<>();
        
        for(int ele: changed){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        
        Arrays.sort(changed);
        
        int arr[]=new int[changed.length/2];
        int pos=0;
        for(int ele: changed){
            if(pos==arr.length) return arr;
            if(ele==0){
                if(map.getOrDefault(ele, 0)>1){
                    arr[pos]=0;
                    pos++;
                    map.put(ele, map.getOrDefault(ele, 1)-2);
                }
            }
            else if(map.containsKey(ele) && map.containsKey(ele) && map.getOrDefault(ele, 0)>0 && map.getOrDefault(ele*2 ,0)>0){
              arr[pos]=ele;
              map.put(ele, map.getOrDefault(ele, 1)-1);
              map.put(ele*2, map.getOrDefault(ele*2, 1)-1);
                pos++;
            }
        }
        
        if(pos==arr.length) return arr;
        return new int[0];
    }
}