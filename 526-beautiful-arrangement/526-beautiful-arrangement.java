class Solution {
   // public boolean[] arr;
    public int ans=0;
    public void solve(int index, boolean arr[], int n){
        if(index>n){
            ans++;
            return;
        } 
         for(int i=1;i<=n;i++){
           if((index%i==0||i%index==0)&&(!arr[i])){
                arr[i]=true;
                solve(index+1, arr, n);
                arr[i]=false;
            }
        } 
    
        
    }
    public int countArrangement(int n) {
     boolean[] arr=new boolean[n+1];
        solve(1, arr, n);
        return ans;
    }
}