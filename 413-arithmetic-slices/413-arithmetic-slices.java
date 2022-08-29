class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans=0;
        if(nums.length<3) return ans;
        int last=0;
        
        for(int i=2;i<nums.length;i++){
            if(2*nums[i-1]==nums[i]+nums[i-2]) {
                last++;
                ans+=last;
            }
            else last=0;
        }
        
        return ans;
    }
}