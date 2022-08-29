
class Solution {
    
    public void clear(char[][] grid, int i, int j){
        if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1 || grid[i][j]=='0') return;
        
        grid[i][j]='0';
        clear(grid,i+1,j);
        clear(grid,i-1,j);
        clear(grid,i,j+1);
        clear(grid,i, j-1);
    }
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    clear(grid,i,j);
                }
            }
        }
        
        return ans;
    }
}