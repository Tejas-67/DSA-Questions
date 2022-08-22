class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int maxi = Integer.MAX_VALUE;
        
        int dp[][] = new int[n][m];
        
         for(int j=0; j<m;j++){
	        int ans = getMaxUtil(n-1,j,m,matrix,dp);
	        maxi = Math.min(maxi,ans);
	    }
	    
	    return maxi;
       
        
    }
    
    public  int getMaxUtil(int i, int j, int m, int[][] matrix,int dp[][]){
	    
	    // Base Conditions
	    if(j<0 || j>=m)
	    	return (int) Math.pow(10, 9);
	    if(i==0)
	        return matrix[0][j];
	    
	    if(dp[i][j]!=0) return dp[i][j];
	    
	    int up = matrix[i][j] + getMaxUtil(i-1,j,m,matrix,dp);
	    int leftDiagonal = matrix[i][j] + getMaxUtil(i-1,j-1,m,matrix,dp);
	    int rightDiagonal = matrix[i][j] + getMaxUtil(i-1,j+1,m,matrix,dp);
	    
	    return dp[i][j] =  Math.min(up,Math.min(leftDiagonal,rightDiagonal));
	    
	}
}