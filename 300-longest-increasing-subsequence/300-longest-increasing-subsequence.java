class Solution {
    public int solve(ArrayList<Integer> list, int n){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<n && list.get(i+1)>=n){
                return i+1;
            }
        }
        return 0;
    }
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>list.get(list.size()-1)){
                list.add(nums[i]);
            }
            else{
                list.set(solve(list,nums[i]),nums[i]);
            }
        }
                    
        return list.size();
    }
}