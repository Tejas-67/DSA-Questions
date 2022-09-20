class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int dp[][]=new int[nums1.length+1][nums2.length+1];
        
        for(int i=0;i<nums2.length+1;i++){
            dp[0][i]=0;
        }
        for(int i=0;i<nums1.length+1;i++){
            dp[i][0]=0;
        }
        int max=0;
        for(int i=1;i<nums1.length+1;i++){
            for(int ii=1;ii<nums2.length+1; ii++){
                if(nums1[i-1]==nums2[ii-1]){
                    dp[i][ii]=1+dp[i-1][ii-1];
                    max=Math.max(max, dp[i][ii]);
                }
                else dp[i][ii]=0;
            }
        }
        
        return max;
    }
}