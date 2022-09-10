class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        int currmin=prices[0];
        int ans=0;
        int currmax=Integer.MIN_VALUE;
        
        
        for(int i=1;i<prices.length;i++){
            if(prices[i]<currmin){
               if(currmax>currmin) ans+=currmax-currmin;
                currmin=prices[i];
                currmax=Integer.MIN_VALUE;
            }
            if(prices[i]<currmax) {
                ans+=currmax-currmin;
                currmin=prices[i];
                currmax=prices[i];
            }
            
            if(prices[i]>currmax) currmax=prices[i];
            
            
        }
        ans+=currmax-currmin;
        return ans;
    }
}