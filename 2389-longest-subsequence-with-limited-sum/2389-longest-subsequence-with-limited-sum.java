class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int ans[]=new int[queries.length];
        int pos=0;
        for(int target:queries){
           // int sum=0;
            int anss=0;
            for(int ele: nums){
                if(ele<=target){
                    anss++;
                    target-=ele;
                }
                else break;
            }
            ans[pos]=anss;
            pos++;
        }
        
        return ans;
    }
}