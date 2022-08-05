class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int flag=1;
        while(i<nums.length){
            if(nums[i]==flag) flag++;
            if(nums[i]>flag) break;
            i++;
        }
        return flag;
    }
}