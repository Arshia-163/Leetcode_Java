class Solution {
    public int numIslands(char[][] grid) {
        
        int m= grid.length;
   int n = grid[0].length;
int count=0;

int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(grid[i][j] =='1'){ // found land
            count++; // upd. island
            bfs(grid,i,j,m,n,dirs);
        }
    }
}
return count;

    }
    private void bfs(char[][] grid,int i,int j,int m,int n,int[][] dirs){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        grid[i][j] = '0'; // mark krdo visit hogya

        while(!q.isEmpty()){
            int[] cell = q.poll();
            int r = cell[0], c = cell[1];

            for(int[] d:dirs){
                int nr = r+d[0] , nc =c+d[1];

                if(nr >=0 && nr<m &&nc>=0 && nc<n && grid[nr][nc] == '1'){
                    q.add(new int[]{nr, nc});
                    grid[nr][nc] = '0';
                }
            }
        }
    }
}