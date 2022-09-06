class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        Map<Integer, List<List<Integer>>> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int d=Math.abs(rCenter-i)+ Math.abs(cCenter-j);
                set.add(d);
                if(map.containsKey(d)){
                    List<List<Integer>> templist=map.get(d);
                    templist.add(Arrays.asList(i,j));
                    map.put(d, templist);
                }
                
                else{
                    List<List<Integer>> templist=new ArrayList<>();
                    templist.add(Arrays.asList(i,j));
                    map.put(d, templist);
                }
            }
        }
        List<Integer> list=new ArrayList<>(set);
        int arr[][]=new int[rows*cols][2];
        int pos=0;
        for(int ele: list){
            List<List<Integer>> curr=map.get(ele);
            
            for(int i=0;i<curr.size();i++){
                arr[pos][0]=curr.get(i).get(0);
                arr[pos][1]=curr.get(i).get(1);
                pos++;
            }
        }
        
        return arr;
    }
}