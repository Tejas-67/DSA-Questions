class Solution {
    public int solve(int index, int arr[], int currval){
        if(index==arr.length) return currval;
        
        int take=solve(index+1, arr, currval^arr[index]);
        int next=solve(index+1, arr, currval);
        
        return take+next;
    }
    public int subsetXORSum(int[] nums) {
        return solve(0, nums, 0);
    }
}