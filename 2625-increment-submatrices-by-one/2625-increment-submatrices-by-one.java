class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        
        int[][] ans = new int[n][n];
  
  for(int[] q: queries){
    int r1 = q[0], c1=q[1];
    int r2 = q[2] , c2= q[3];

        for(int i=r1;i<=r2;i++){
for(int j=c1;j<=c2;j++){
    ans[i][j] += 1;
}
        }}
         return ans;
    }
   
}