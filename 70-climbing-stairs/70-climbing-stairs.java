class Solution {
    int arr[]=new int[45];
    public void fill(){
        arr[0]=1;
        arr[1]=2;
        for(int i=2;i<45;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
    }
    public int climbStairs(int n) {
        fill();
        return arr[n-1];
    }
}