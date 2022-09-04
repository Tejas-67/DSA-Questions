class Solution {
    public int[] solve(int n){
        int f=n/2*(-1);
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(f==0) f=1;
            arr[i]=f++;
        }
        
        return arr;
    }
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        boolean flag=(n%2==0);
        if(flag) return solve(n);
        int p=1,pp=-1;
        arr[n/2]=0;
        for(int i=1;i<=n/2;i++){
            arr[n/2+i]=p++;
            arr[n/2-i]=pp--;
        }
        
        return arr;
    }
}