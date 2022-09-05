/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        Queue<Node> q=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        q.add(root);
        while(q.isEmpty()==false){
            int size=q.size();
            List<Integer> listt=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node currnode=q.remove();
                listt.add(currnode.val);
                for(int index=0;index<currnode.children.size();index++){
                    q.add(currnode.children.get(index));
                }
            }
            
            list.add(listt);
            
        }
        
        return list;
    }
}