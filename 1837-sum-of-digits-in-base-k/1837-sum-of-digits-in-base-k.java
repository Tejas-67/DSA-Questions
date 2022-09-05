class Solution {
    
//     public int solve(int n, int base){
//         int ans=0;
//         while(n!=0){
//             int rem=n%base;
//             ans+=rem;
//             n=n/base;
//         }
        
//         return ans;
//     }
    public int sumBase(int n, int k) {
        int ans=0;
        while(n!=0){
            ans+=n%k;
            n=n/k;
        }
        
        return ans;
    }
}