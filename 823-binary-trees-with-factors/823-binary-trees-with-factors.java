class Solution {
    public final double mod=1000000007;
    public int numFactoredBinaryTrees(int[] arr) {
        long ans=1;
        Arrays.sort(arr);
        Map<Integer, Long> map=new HashMap<>();
        map.put(arr[0],ans);
        for(int i=1;i<arr.length;i++){
           // map.put(arr[i],1);
            long currsum=1;
            for(int ii=0;ii<i;ii++){
                if(arr[i]%arr[ii]==0 && map.containsKey(arr[i]/arr[ii])) currsum=currsum+map.get(arr[ii])*map.get(arr[i]/arr[ii]);
            }
            map.put(arr[i],currsum);
            ans=ans+currsum;
        }
        
        return (int)(ans%mod);
    }
}