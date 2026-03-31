class Solution {
    List<List<Integer>> res;
    boolean pacific, atlantic;
    int ROWS;
    int COLS;

    int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        res = new ArrayList<>();
        ROWS = heights.length;
        COLS = heights[0].length;

        for(int r = 0; r < ROWS; r++) {
            for(int c = 0; c < COLS; c++) {
                pacific = false;
                atlantic = false;

                dfs(heights, r, c, Integer.MAX_VALUE);

                if(pacific && atlantic) {
                    res.add(Arrays.asList(r,c));
                }
            
            }
        }

        return res;
    }

    private void dfs(int[][] heights, int r, int c, int preVal) {
       if(r < 0 || c < 0) {
        pacific = true;
        return;
       } 

       if(r >= ROWS || c >= COLS) {
        atlantic = true;
        return;
       }

       if(heights[r][c] > preVal) {
        return;
       }

       int temp = heights[r][c];
       heights[r][c] = Integer.MAX_VALUE;

       for(int[] dir : direction) {
        dfs(heights, r + dir[0], c + dir[1], temp);
        if(pacific && atlantic) {
            break;
        }
       }

       heights[r][c] = temp;
    }

}
