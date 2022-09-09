class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a,b) -> (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));
        int ans=0;
        int len=properties.length;
        
        int max=properties[len-1][1];
        // for(int i=0;i<len;i++){
        //     for(int j=0;j<len;j++){
        //         System.out.println(properties[i][0]+" "+properties[i][1]);
        //     }
        // }
        
        for(int i=len-2;i>=0;i--){
            if(properties[i][1]<max) ans++;
            else max=properties[i][1];
        }
        
        return ans;
    }
}