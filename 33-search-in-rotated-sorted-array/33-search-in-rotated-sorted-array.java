class Solution {
    public int solve(int[] nums,int target,int low,int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int bp=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                bp=i;
                break;
            }
        }
        if(nums[0]<=target && nums[bp]>=target) return solve(nums,target,0,bp);
        else return solve(nums,target,bp+1,nums.length-1);
    }
}