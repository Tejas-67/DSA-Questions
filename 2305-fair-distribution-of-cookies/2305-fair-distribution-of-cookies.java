class Solution {
    public int solve(int arr[], int curr[], int index){
        if(index<0){
            int max=0;
            for(int i=0;i<curr.length;i++){
                max=Math.max(max, curr[i]);
            }
            
            return max;
        }
        
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<curr.length;i++){
            curr[i]+=arr[index];
            ans=Math.min(ans, solve(arr, curr, index-1));
            curr[i]-=arr[index];
        }
        
        return ans;
    }
    public int distributeCookies(int[] cookies, int k) {
        int arr[]=new int[k];
        return solve(cookies, arr, cookies.length-1);
    }
}