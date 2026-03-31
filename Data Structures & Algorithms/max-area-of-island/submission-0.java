class Solution {
    public int maxAreaOfIsland(int[][] grid) {
       if(grid == null || grid.length == 0) return 0;

       int resArea = 0;
       int r = grid.length;
       int c = grid[0].length;

       for(int i = 0; i < r; i++) {
        for(int j = 0; j < c; j++) {
            if(grid[i][j] == 1) {
               int area = dfs(grid, i, j, r, c);
               resArea = Math.max(resArea, area);
            }   
        }
       } 

    return resArea;
    }

    private int dfs(int[][] grid, int i, int j, int r, int c) {
        if(i < 0 || j < 0 || i >= r || j >= c || grid[i][j] == 0) return 0;

        grid[i][j] = 0;

        return 1 + dfs(grid, i + 1, j, r, c) + dfs(grid, i - 1, j, r, c) + dfs(grid, i, j + 1, r, c) + dfs(grid, i, j - 1, r, c);
    }
}
