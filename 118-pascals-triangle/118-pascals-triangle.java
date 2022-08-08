class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(Arrays.asList(1));
        if(numRows==1) return ans;
        ans.add(Arrays.asList(1,1));
        for(int i=2;i<numRows;i++){
            List<Integer> tobeadded=new ArrayList<>();
            List<Integer> temp=ans.get(ans.size()-1);
            tobeadded.add(1);
            for(int ii=0;ii<temp.size()-1;ii++){
                tobeadded.add(temp.get(ii)+temp.get(ii+1));
            }
            tobeadded.add(1);
            
            ans.add(tobeadded);
        }
        
        
        return ans;
    }
}