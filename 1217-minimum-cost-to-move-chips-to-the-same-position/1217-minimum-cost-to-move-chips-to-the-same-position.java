class Solution {
    public int minCostToMoveChips(int[] position) {
        int even=0;
        for(int ele: position) if(ele%2==0) even++;
        
        return Math.min(even, position.length-even);
    }
}