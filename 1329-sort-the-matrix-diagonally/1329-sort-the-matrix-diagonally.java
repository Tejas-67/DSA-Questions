class Solution {
    public int[][] diagonalSort(int[][] mat) {
        for(int i=0;i<mat[0].length-1;i++){
            List<Integer> list=new ArrayList<>();
            int col=i;
            int row=0;
            while(row<mat.length && col<mat[0].length){
                list.add(mat[row][col]);
                row++;
                col++;
            }
            Collections.sort(list);
            row=0;
            col=i;
            for(int ele: list){
                mat[row][col]=ele;
                row++;
                col++;
            }
            
        }
        for(int i=1;i<mat.length-1;i++){
            int col=0;
            int row=i;
            List<Integer> list=new ArrayList<>();
            while(row<mat.length && col<mat[0].length){
                list.add(mat[row][col]);
                row++;
                col++;
            }
            Collections.sort(list);
            row=i;
            col=0;
            for(int ele: list){
                mat[row][col]=ele;
                row++;
                col++;
            }
        }
        
        return mat;
    }
}