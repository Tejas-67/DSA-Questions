class Solution {
    public int countSubstrings(String s, String t) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                int ps=i;
                int pt=j;
                int diff=0;
                while(ps<s.length() && pt<t.length()){
                    if(s.charAt(ps)!=t.charAt(pt)) diff++;
                    if(diff==1) ans++;
                    else if(diff>1) break;
                    ps++;
                    pt++;
                }
            }
        }
        
        return ans;
    }
}