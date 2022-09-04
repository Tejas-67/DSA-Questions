class Solution {
    public boolean check(int n){
        int temp=n;
        while(n!=0){
            int rem=n%10;
            if(rem==0 || temp%rem!=0) return false;
            n=n/10;
        }
        
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        // for(int i=left;i<13;i++){
        //     if(i%10!=0) list.add(i);
        // }
        
        for(int i=left;i<right+1;i++){
            
            if(i%10!=0 && check(i)) list.add(i);
        }
        
        return list;
    }
}