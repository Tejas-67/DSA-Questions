class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        int sum=0;
        int ans=0;
        for(int ele: nums){
            sum+=ele;
            int res=sum-k;
            if(res==0) ans++;
            ans+=map.getOrDefault(res, 0);
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        
        return ans;
    }
}