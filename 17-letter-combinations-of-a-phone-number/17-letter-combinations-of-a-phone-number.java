class Solution {
    //List<String> ans;
    Map<Character, String> map;

    public List<String> solve(String s, int index, List<String> list){
        if(index<0) return list;
        
        char c=s.charAt(index);
        String ss=map.get(c);
        List<String> currlist=new ArrayList<>();
        for(int i=0;i<ss.length();i++){
            for(String ele: list){
                currlist.add( ss.charAt(i) + ele);
            }
        }
        
        return solve(s, index-1, currlist);
    }
    public List<String> letterCombinations(String digits) {
        
        List<String> ans=new ArrayList<>();
        
        if(digits.length()==0) return ans;
        map=new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5',  "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        String add=map.get(digits.charAt(digits.length()-1));
        
        for(int i=0;i<add.length();i++){
            ans.add(add.charAt(i)+"");
        }
        
        return solve(digits, digits.length()-2, ans);
    }
}