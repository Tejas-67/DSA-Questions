class Solution {
    public String pushDominoes(String dominoes) {
        int n=dominoes.length();
        int res[]=new int[n];
      //  String ans="";
        int force=0;
        for(int i=0;i<n;i++){
            char ch=dominoes.charAt(i);
            if(ch=='R') force=n;
            else if(ch=='L') force=0;
            else force=Math.max(force-1, 0);
            
            res[i]+=force;
        }
        force=0;
        for(int i=n-1;i>=0;i--){
            char ch=dominoes.charAt(i);
            if(ch=='L') force=n;
            else if(ch=='R') force=0;
            else force=Math.max(force-1, 0);
            
            res[i]-=force;
        }
        
        StringBuilder ans=new StringBuilder();
        for(int f: res){
            if(f<0) ans.append('L');
            if(f>0) ans.append('R');
            if(f==0) ans.append('.');
        }
        
        return ans.toString();
    }
}