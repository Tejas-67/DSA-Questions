class Solution {
    public int concatenatedBinary(int n) {
       // if(n==1) return 1;
        final long M=(long)(1e9 +7);
        long ans=0;
        int digits=0;
        
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0) digits++;
            
            ans=((ans<< digits) + i)%M;
        }
        
        return (int)ans;
    }
}
