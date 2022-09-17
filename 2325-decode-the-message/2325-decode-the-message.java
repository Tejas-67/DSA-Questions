class Solution {
    public String decodeMessage(String key, String message) {
        char w[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
        
        Map<Character, Integer> map=new HashMap<>();
        int pos=0;
        for(int i=0;i<key.length();i++){
            
            if(key.charAt(i)!=' ' && map.containsKey(key.charAt(i))==false) {
                map.put(key.charAt(i), pos);
                pos++;
            }
        }
        for(char ele: map.keySet()){
            System.out.println(ele+" "+map.get(ele));
        }
        
        String ans="";
        
        for(int i=0;i<message.length();i++){
            ans+=w[map.getOrDefault(message.charAt(i), 26)];
            
        }
        
        return ans;
    }
}