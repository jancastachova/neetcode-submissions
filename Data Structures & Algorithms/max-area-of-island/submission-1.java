class Solution {
    private int count=0;
    public int maxAreaOfIsland(int[][] grid) {
        
        if(grid==null || grid.length==0) return 0;
        int rows = grid.length;
        int columns = grid[0].length;
        int maxArea=0;

        for(int r=0; r<rows; r++){
            for(int c=0; c<columns; c++){
                if(grid[r][c]==1){
                    count=0;
                    dfs(grid, r, c);
                    maxArea= Math.max(maxArea, count);
                }
            }
        }
        return maxArea;
    }
    private void dfs(int[][] grid, int r, int c){
        int rows=grid.length;
        int columns=grid[0].length;

        if(r<0 || r>= rows || c<0 || c>= columns || grid[r][c] == 0) return;

        count++;
        grid[r][c]=0;

        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);


    }
}
