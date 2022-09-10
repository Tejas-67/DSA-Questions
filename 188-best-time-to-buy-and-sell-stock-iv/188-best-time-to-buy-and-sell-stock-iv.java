class Solution {
    public int maxProfit(int k, int[] prices) {
        if(k==0 || prices.length==1) return 0;
        int minp[]=new int[k];
        int maxp[]=new int[k];
        
        for(int i=0;i<k;i++){
            minp[i]=Integer.MAX_VALUE;
            maxp[i]=0;
        }
        
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<k;j++){
                int s=j>0? maxp[j-1]: 0;
                minp[j]=Math.min(minp[j], prices[i]-s);
              //  minp[j]=Math.min(minp[j], prices[i]);
                maxp[j]=Math.max(maxp[j], prices[i]-minp[j]);
            }
        }
        
        return maxp[k-1];
    }
}