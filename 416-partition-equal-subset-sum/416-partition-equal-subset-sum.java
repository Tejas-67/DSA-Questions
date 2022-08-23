class Solution {
    public int dp[][];
    public boolean solve(int index, int target, int arr[]){
        if(index==0){
            if(target==arr[0]) return true;
            else return false;
        }
        if(dp[index][target]!=-1) return (dp[index][target]==1);
        
        boolean next=solve(index-1, target, arr);
        boolean curr=false;
        if(target>=arr[index]) curr= solve(index-1, target-arr[index], arr);
        
        dp[index][target]=(next||curr)?1:0;
        return next||curr;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        dp=new int[nums.length][sum/2 +1];
        for(int a[]: dp){
            Arrays.fill(a,-1);
        }
        return solve(nums.length-1, sum/2 , nums);
    }
}