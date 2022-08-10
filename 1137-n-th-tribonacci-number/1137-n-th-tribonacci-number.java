class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n<3) return 1;
        int ans=0;
        int s1=0;
        int s2=1;
        int s3=1;
        for(int i=3;i<=n;i++){
            ans=s1+s2+s3;
            s1=s2;
            s2=s3;
            s3=ans;
        }
        
        return ans;
    }
}