class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans=0;
        int diff=Integer.MAX_VALUE;
        int len=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<len-2;i++){
            int low=i+1;
            int high=len-1;
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==target) return target;
                else if(sum>target){
                    high--;
                    if(sum-target<diff){
                        diff=sum-target;
                        ans=sum;
                    }
                }
                else if(target>sum){
                    low++;
                    if(target-sum<diff){
                        diff=target-sum;
                        ans=sum;
                    }
                }
               
            }
        }
        
        return ans;
    }
}