class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans=new HashSet<>();
        Arrays.sort(nums);
        if(nums[0]==nums[nums.length-1] && nums[0]==0){
            ans.add(Arrays.asList(0,0,0));
            //return ans;
        }
        for(int i=0;i<nums.length-2;i++){
            //if(i>0 && nums[i]!=nums[i-1]){
                int j=i+1;
                int k=nums.length-1;
                while(j<k){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum==0) ans.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                    else if(sum<0) j++;
                    else k--;
                }
            //}
        }
        List<List<Integer>> list=new ArrayList<>(ans);
        return list;
    }
}