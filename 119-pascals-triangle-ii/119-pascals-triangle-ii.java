class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public void fill(){
        list.add(Arrays.asList(1));
        list.add(Arrays.asList(1,1));
        list.add(Arrays.asList(1,2,1));
        for(int ii=2;ii<33;ii++){
            List<Integer> temp=list.get(ii);
            List<Integer> tobeadded=new ArrayList<Integer>();
            tobeadded.add(1);
            for(int i=0;i<temp.size()-1;i++){
                tobeadded.add(temp.get(i)+temp.get(i+1));
            }
            tobeadded.add(1);
            list.add(tobeadded);
        }
    }
    public List<Integer> getRow(int rowIndex) {
        fill();
        return list.get(rowIndex);
    }
}