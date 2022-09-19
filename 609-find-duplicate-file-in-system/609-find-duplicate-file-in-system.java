class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map=new HashMap<>();
      //  int index=0;
        
        for(String ele: paths){
            String d="";
            int i;
            int len=ele.length();
            for(i=0;i<ele.length();i++){
                if(ele.charAt(i)==' ') break;
                d+=ele.charAt(i);
            }
            String f="";
            String name="";
            i++;
            boolean isnotname=true;
            for(int index=i;index<len;index++){
                char curr=ele.charAt(index);
                if(curr==' '){
                    f="";
                    name="";
                    isnotname=true;
                }
                else if(curr=='('){
                    isnotname=false;
                }
                else if(curr==')'){
                    List<String> list=map.getOrDefault(name, new ArrayList<>());
                    list.add(d+'/'+f);
                    map.put(name, list);
                }
                else if(!isnotname) name+=curr;
                
                else if(isnotname) f+=curr;
                
            }
        }
        
        List<List<String>> ans=new ArrayList<>();
        
        for(String ele: map.keySet()){
            
           if(map.get(ele).size()>1)  ans.add(map.get(ele));
        }
        
        return ans;
    }
}