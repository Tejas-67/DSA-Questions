class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int ele: nums){
            max=Math.max(max, ele);
            min=Math.min(min, ele);
        }
        if(min+k>=max-k) return 0;
        return max-min-2*k;
    }
}