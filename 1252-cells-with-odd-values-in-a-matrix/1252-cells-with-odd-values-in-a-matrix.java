class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        HashMap<Integer, Integer> row=new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> col=new HashMap<Integer, Integer>();
        for(int i=0;i<indices.length;i++){
            row.put(indices[i][0], row.getOrDefault(indices[i][0],0)+1);
            col.put(indices[i][1], col.getOrDefault(indices[i][1],0)+1);
            
        }
        
        
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((row.getOrDefault(i,0)+col.getOrDefault(j,0))%2==1) ans++;
            }
        }
        
        return ans;
    }
}