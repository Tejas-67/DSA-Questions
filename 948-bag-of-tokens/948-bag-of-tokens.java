class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0;
        Arrays.sort(tokens);
        int start=0, end=tokens.length-1;
        
        while(start<=end){
            if(power>=tokens[start]){
                power-=tokens[start];
                score++;
                start++;
            }
            else if(power<tokens[start]){
                if(start==end) return score;
                if(score>0){
                    score--;
                    power+=tokens[end];
                    end--;
                }
                else break;
            }
            
        }
        
        return score;
    }
}