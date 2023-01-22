//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        int ans=0;
        boolean v[][]=new boolean[grid.length][grid[0].length];
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && !v[i][j]){
                    ans++;
                    List<Integer> list=new ArrayList<>();
                    bfs(i, j,list, v, grid,0);
                    Collections.sort(list);
                    set.add(list);
                }
            }
        }
        return set.size();
    }
    public static void bfs(int i, int j,List<Integer> list, boolean v[][], int grid[][], int co){
        if(i<0 || j<0 || i==grid.length || j==grid[0].length || grid[i][j]==0 || v[i][j]) return;
        v[i][j]=true;
        list.add(co);
        bfs(i+1, j,list, v, grid, co+grid[0].length);
        bfs(i-1, j,list, v, grid, co-grid[0].length);
        bfs(i, j-1,list, v, grid, co-1);
        bfs(i, j+1,list, v, grid, co+1);
    }
}
