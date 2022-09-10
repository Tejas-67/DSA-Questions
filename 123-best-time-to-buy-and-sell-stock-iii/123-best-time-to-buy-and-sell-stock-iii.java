class Solution {
    public int maxProfit(int[] prices) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int profit=0;
        int relative_profit=0;
        
        for(int i=0;i<prices.length;i++){
            min1=Math.min(min1, prices[i]);
            profit=Math.max(profit, prices[i]-min1);
            
            min2=Math.min(min2, prices[i]-profit);
            relative_profit=Math.max(relative_profit, prices[i]-min2);
        }
        
        return relative_profit;
    }
}