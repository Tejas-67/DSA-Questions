class Solution {
    public String reverseWords(String s) {
        String ans="";
        String tobeadded="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                ans+=tobeadded+" ";
                tobeadded="";
            }
            else{
                tobeadded=s.charAt(i)+tobeadded;
            }
        }
        ans+=tobeadded;
        return ans;
    }
}