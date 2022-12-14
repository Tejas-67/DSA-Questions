class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=efficiency[i];
            arr[i][1]=speed[i];
        }
        
         Arrays.sort(arr, (p1, p2) -> (p2[0] - p1[0]));
        
        PriorityQueue<Integer> speedQueue = new PriorityQueue<>(k);
        long teamPerformance = 0, teamSpeed = 0;

        for (int i=0; i<n; i++) {
			// This is because a team can have atmost `k` players.
            if (speedQueue.size() >= k) {
                teamSpeed -= speedQueue.remove();
            }
            speedQueue.add(arr[i][1]);
            teamSpeed += arr[i][1];

            teamPerformance = Math.max(teamPerformance, teamSpeed * arr[i][0]);
        }
        return (int) (teamPerformance % 1000000007);
        
        
    }
}