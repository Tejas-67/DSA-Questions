class Solution {
    boolean overlap(int x1, int x2, int y1, int y2) {
  return (x1 >= y1 && x1 <= y2) ||
         (x2 >= y1 && x2 <= y2) ||
         (y1 >= x1 && y1 <= x2) ||
         (y2 >= x1 && y2 <= x2);
}
//     public static void sortbyColumn(int arr[][], int col)
//     {
//         // Using built-in sort function Arrays.sort
//         Arrays.sort(arr, new Comparator<int[]>() {
            
//           @Override              
//           // Compare values according to columns
//           public int compare(final int[] entry1, 
//                              final int[] entry2) {
  
//             // To sort in descending order revert 
//             // the '>' Operator
//             if (entry1[col] > entry2[col])
//                 return 1;
//             else
//                 return -1;
//           }
//         });  // End of function call sort().
//     }
    public int[][] merge(int[][] intervals) {
       //sortbyColumn(intervals,0);
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
       List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(list.size()>0){
                List<Integer> temp=list.get(list.size()-1);
                int s=temp.get(0);
                int e=temp.get(1);
                if(overlap(s,e,start,end)){
                    list.remove(list.size()-1);
                    list.add(Arrays.asList(Math.min(s,start), Math.max(e,end)));
                    
                }
                else list.add(Arrays.asList(start,end));
            }
            else list.add(Arrays.asList(start,end));
        }
        
        
        int ans[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            ans[i][0]=list.get(i).get(0);
            ans[i][1]=list.get(i).get(1);
            
        }
          return ans;
    }
}