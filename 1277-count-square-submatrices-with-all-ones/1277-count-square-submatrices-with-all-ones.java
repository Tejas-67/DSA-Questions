class Solution {
    public int countSquares(int[][] matrix) {
        int ans=0;
         int dp[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            dp[0][i]=matrix[0][i];
            ans+=dp[0][i];
        }
        for(int i=1;i<matrix.length;i++){
            dp[i][0]=matrix[i][0];
            ans+=dp[i][0];
        }
        
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]!=0) dp[i][j]=Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]))+1;
                else dp[i][j]=0;
            
                ans+=dp[i][j];
                //System.out.println(ans+" "+i+" "+j);
            }
        }
        return ans;
    }
}