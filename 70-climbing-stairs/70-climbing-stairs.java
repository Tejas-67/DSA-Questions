class Solution {
    public int climbStairs(int n) {
        int first=1;
        int ans=0;
        int second=2;
        if(n==1) return first;
        if(n==2) return 2;
        for(int i=3;i<=n;i++){
            ans=first+second;
            first=second;
            second=ans;
        }
        
        return ans;
    }
}