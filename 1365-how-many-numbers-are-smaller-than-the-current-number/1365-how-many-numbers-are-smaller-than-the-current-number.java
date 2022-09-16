class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int bucket[]=new int[101];
        for(int ele: nums) bucket[ele]++;
        
        for(int i=1;i<101;i++){
            bucket[i]+=bucket[i-1];
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=0) nums[i]=bucket[nums[i]-1];
        }
        
        return nums;
    }
}