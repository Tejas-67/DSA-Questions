class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n%4!=0) return false;
        double nn= Math.log(n)/Math.log(4) ;
        int nnn=(int)(nn);
        if(nn-nnn==0) return true;
        return false;
    }
}