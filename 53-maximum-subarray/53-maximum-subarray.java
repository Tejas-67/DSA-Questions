class Solution {

    //KADANE'S ALGORITHM
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            if(currsum>ans) ans=currsum;
            if(currsum<0) currsum=0;
        }
        
        return ans;
    }
}