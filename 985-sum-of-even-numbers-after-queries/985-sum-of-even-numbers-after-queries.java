class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
      //  boolean dp[]=new boolean[nums.length];
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) sum+=nums[i];
        }
        
        
        int ans[]=new int[queries.length];
        
        
        for(int i=0;i<queries.length;i++){
            int val=queries[i][0];
            int index=queries[i][1];
            int value=nums[index];
            boolean waseven=false;
            boolean iseven=false;
            
            waseven=(nums[index]%2==0);
            nums[index]+=val;
            iseven=(nums[index]%2==0);
            
            if(waseven && iseven) sum+=val;
            else if(waseven && !iseven) sum-=value;
            else if(!waseven && iseven) sum+=nums[index];
            
            
            ans[i]=sum;
            
        }
        
        return ans;
    }
}