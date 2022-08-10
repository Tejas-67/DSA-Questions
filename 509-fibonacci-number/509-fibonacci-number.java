class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n<3) return 1;
        int ans=0;
        int s=1;
        int f=1;
        for(int i=3;i<n+1;i++){
            ans=f+s;
            f=s;
            s=ans;
            
        }
        
        return ans;
    }
}