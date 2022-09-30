class Solution {
//     public List<List<Integer>> getSkyline(int[][] buildings) {
//         Map<Integer, Integer> map=new TreeMap<>();
        
//         Map<Integer, Integer> mapp=new TreeMap<>();
        
//         for(int arr[]: buildings){
//             map.put(arr[0], arr[2]);
//             map.put(arr[1], 0);
//         }
        
//         for(int ele: map.keySet()){
//             int maxH=map.get(ele);
//             for(int b[]: buildings){
//                 if(ele<b[0]) break;
//                 if(ele<b[1] && maxH<b[2]) maxH=b[2];
//             }
            
//             mapp.put(ele, maxH);
//         }
        
//         List<List<Integer>> ans=new ArrayList<>();
        
//         int prevH=0;
//         for(int ele: map.keySet()){
//             int h=map.get(ele);
//            // for(int b[]: buidings){}
//             if(h!=prevH){
//                 ans.add(Arrays.asList(ele, h));
//                 prevH=h;
//             }
//         }
        
//         return ans;
//     }
// }
public List<List<Integer>> getSkyline(int[][] buildings) {
        var m = new TreeMap<Integer, Integer>();
        var pm = m;
        for(int[] b : buildings) {
            m.put(b[0], b[2]);  // put -> {left, height}
            m.put(b[1], 0);     // put -> {right, 0}
        }
        
        for(var e : m.entrySet()) {
            int maxH = e.getValue();
            int pos = e.getKey();
            for(int[] b : buildings) {
                if(pos < b[0]) break;
                if(pos < b[1] && maxH < b[2]) maxH = b[2];
            }
            pm.put(pos, maxH);
        }
        
        var result = new ArrayList<List<Integer>>();
        int prevH = 0;
        for(var e : pm.entrySet()) {
            int h = e.getValue();
            int pos = e.getKey();
            if(h != prevH) {
                result.add(new ArrayList(Arrays.asList(pos, h)));
                prevH = h;
            }
        }
        
        return result;
    }}