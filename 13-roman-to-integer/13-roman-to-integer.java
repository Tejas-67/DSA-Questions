class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int i=0;
        while(i<s.length()-1){
            if(s.charAt(i)=='I'){
                if(s.charAt(i+1)=='V') {
                    ans+=4;
                    i+=2;
                }

                else if(s.charAt(i+1)=='X') {
                    ans+=9;
                    i+=2;
                }
                else {
                    ans+=1;
                    i++;
                }
            }
           else if(s.charAt(i)=='X'){
                if(s.charAt(i+1)=='L'){
                    ans+=40;
                    i+=2;
                } 
                else if(s.charAt(i+1)=='C'){
                    ans+=90;
                    i+=2;
                } 
                else {
                    ans+=10;
                    i++;
                }
            }
            
           else if(s.charAt(i)=='C'){
                if(s.charAt(i+1)=='D'){
                    ans+=400;
                    i+=2;
                }
                else if(s.charAt(i+1)=='M'){
                    ans+=900;
                    i+=2;
                }
                else {
                    ans+=100;
                    i++;
                }
            }
            else{
                 if(s.charAt(i)=='V') ans+=5;
                //if(s.charAt(i)=='X') ans+=10;
                if(s.charAt(i)=='L') ans+=50;
                //if(s.charAt(i)=='C') ans+=100;
                if(s.charAt(i)=='D') ans+=500;
                if(s.charAt(i)=='M') ans+=1000;
                i++;
            }
           
        }
        if(i==s.length()-1){
                if(s.charAt(i)=='I') ans+=1;
                 if(s.charAt(i)=='V') ans+=5;
                if(s.charAt(i)=='X') ans+=10;
                if(s.charAt(i)=='L') ans+=50;
                if(s.charAt(i)=='C') ans+=100;
                if(s.charAt(i)=='D') ans+=500;
                if(s.charAt(i)=='M') ans+=1000;
            
        
    }
        return ans;
    }
}