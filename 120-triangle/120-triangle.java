class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        for(int i=n-2;i>=0;i--){
            List<Integer> currlist=triangle.get(i);
            List<Integer> next=triangle.get(i+1);
            
            for(int j=0;j< currlist.size();j++){
                currlist.set(j, currlist.get(j)+Math.min(next.get(j), next.get(j+1)));
            }
        }
        
        return triangle.get(0).get(0);
        
        
    }
}