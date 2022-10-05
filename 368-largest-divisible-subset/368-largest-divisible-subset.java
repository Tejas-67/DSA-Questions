class Solution {
    List<Integer> ans=new ArrayList<>();
    public void solve(int arr[], int index, List<Integer> list, int dp[]){
        if(index==arr.length){
            if(list.size()> ans.size()) ans=list;
            return ;
        }
        
        if(list.size()>dp[index] &&(list.size()==0 || arr[index]%list.get(list.size()-1)==0)){
            dp[index]=list.size();
            list.add(arr[index]);
            solve(arr, index+1, new ArrayList<>(list), dp);
            list.remove(list.size()-1);
        }
        solve(arr, index+1, list, dp);
    }
    public List<Integer> largestDivisibleSubset(int[] nums) {
        //if(nums.length==1) return new ArrayList<>();
        Arrays.sort(nums);
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp, -1);
        solve(nums, 0, new ArrayList<>(), dp);
        
        return ans;
    }
}