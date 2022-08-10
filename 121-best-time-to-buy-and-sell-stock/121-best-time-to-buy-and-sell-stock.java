class Solution {
    public int maxProfit(int[] prices) {
        int least=Integer.MAX_VALUE;
        int profit=0;
        
        for(int i=0;i<prices.length;i++){
            least=Math.min(prices[i],least);
            profit=Math.max(profit, prices[i]-least);
        }
        
        
        return profit;
    }
}