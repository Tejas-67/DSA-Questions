class Solution {
    public int[] count(int n){
        int ans[]=new int[10];
        while(n!=0){
            ans[n%10]++;
            n/=10;
        }
        return ans;
    }
    public boolean check(int arr[], int brr[]){
        for(int i=0;i<10;i++){
            if(arr[i]!=brr[i]) return false;
        }
        
        return true;
    }
    public boolean reorderedPowerOf2(int n) {
        int count[]=count(n);
        int t=1;
        for(int i=0;i<30;i++){
            int powerset[]=count(t);
            if(check(powerset, count)) return true;
            t*=2;
        }
        
        return false;
    }
}