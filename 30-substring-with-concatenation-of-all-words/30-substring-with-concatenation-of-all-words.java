class Solution {
    public int n;
    public int len;
    public int wordlen;
    public int subsize;
    public HashMap<String, Integer> map=new HashMap<String, Integer>();
    
    public boolean isvalid(int i, String str){
        HashMap<String , Integer> temp=new HashMap<>(map);
        int count=0;
        for(int pos=i;pos<i+subsize;pos+=wordlen){
            String t=str.substring(pos, pos+wordlen);
            if(temp.getOrDefault(t, 0)!=0){
                count++;
                temp.put(t, temp.get(t)-1);
            }
            else break;
        }
        
        return (count==n);
    }
    
    public List<Integer> findSubstring(String s, String[] words) {
        n=words.length;
        len=s.length();
        wordlen=words[0].length();
        subsize=wordlen*n;
        //map=new HashMap<String, Integer>();
        for( String ele: words){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        List<Integer> list=new ArrayList<Integer>();
        
        for(int i=0;i<len-subsize+1;i++){
            if(isvalid(i, s)) list.add(i);
        }
        
        return list;
    }
}