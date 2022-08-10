class Solution {
    int bit[]=new int[100001];
    public void fill(){
        bit[0]=0;
        bit[1]=1;
        bit[2]=1;
        bit[3]=2;
        bit[4]=1;
        for(int i=5;i<bit.length;i++){
            int num=i;
            while(num>0){
                if((num&1)==1){
                    bit[i]++;
                }
                num=num>>1;
            }
        }

    }
    public int[] countBits(int n) {
        fill();
        int ans[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            ans[i]=bit[i];
        }
        
        return ans;
        
    }
}