class Solution {
    public int solve(int n, int m){
        int ans=0;
        int nn=Math.min(n,m);
        int mm=n+m-nn;
        if(mm%nn==0) return nn;
        for(int i=1;i<=nn/2;i++){
            if((nn%i)==0 && (mm%i==0)) ans=i;
        }
        
        return ans;
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return solve(nums[0], nums[nums.length-1]);
    }
}