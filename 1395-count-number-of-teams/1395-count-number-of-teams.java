class Solution {
    public int numTeams(int[] rating) {
        int ans=0;
        for(int i=0;i<rating.length;i++){
            int num=rating[i];
            
            int less_before=0, less_after=0, more_before=0, more_after=0;
            int pos=0;
            while(pos<i){
                if(rating[pos]<num) less_before++;
                if(rating[pos]>num) more_before++;
                pos++;
            }
            pos=i+1;
            while(pos<rating.length){
                if(rating[pos]<num) less_after++;
                if(rating[pos]>num) more_after++;
                pos++;
            }
            
            ans+=(less_before*more_after) + (less_after*more_before);
        }
        
        return ans;
    }
}