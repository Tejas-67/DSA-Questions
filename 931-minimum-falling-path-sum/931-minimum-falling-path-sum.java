class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        
        for(int row=1;row<n;row++){
            matrix[row][0]=Math.min(matrix[row-1][0]+matrix[row][0], matrix[row-1][1]+matrix[row][0]);
                
                for(int i=1;i<n-1;i++){
                    matrix[row][i]=Math.min(matrix[row-1][i],Math.min(matrix[row-1][i+1], matrix[row-1][i-1])) + matrix[row][i];
                }
            matrix[row][n-1]=Math.min(matrix[row-1][n-1], matrix[row-1][n-2]) + matrix[row][n-1];
        }
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            ans=Math.min(ans, matrix[n-1][i]);
            
        }
        
        return ans;
    }
}