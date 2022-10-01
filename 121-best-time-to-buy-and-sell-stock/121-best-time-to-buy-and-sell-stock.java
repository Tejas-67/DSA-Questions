class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        //int max=Integer.MIN_VALUE;
        int res=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min, prices[i]);
            res=Math.max(res, prices[i]-min);
            
        }
        
        return res;
    }
}