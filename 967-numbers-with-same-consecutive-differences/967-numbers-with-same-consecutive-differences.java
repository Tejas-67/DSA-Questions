class Solution {
    public void solve(int lastdigit, int val, List<Integer> list, int k, int n){
        if(n==0){
            list.add(val);
            return;
        }
        
        int num=lastdigit+k;
        if(num<10){
           solve((val*10 +num)%10,val*10 + num, list, k, n-1);
        }
        
        num=lastdigit-k;
        if(num>=0 && k!=0){
            solve((val*10 + num)%10, val*10+num, list, k, n-1);
        }
    }
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<10;i++) solve(i,i,ans,k,n-1);
        
        
        int arr[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        
        return arr;
    }
}