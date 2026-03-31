class Solution {
    public boolean isValidSudoku(char[][] board) {
       boolean[][] rows = new boolean[9][9];
       boolean[][] cols = new boolean[9][9];
       boolean[][] boxs = new boolean[9][9];

       for(int i = 0; i < 9; i++) {
        for(int j = 0; j < 9; j++) {
            char c = board[i][j];
            if(c == '.') continue;

            int boxIndex = (i / 3) * 3 + (j / 3);

            int d = c - '1';

            if(rows[i][d]) return false;

            if(cols[j][d]) return false;

            if(boxs[boxIndex][d]) return false;

            rows[i][d] = true;
            cols[j][d] = true;
            boxs[boxIndex][d] = true;
        }
       }
       return true;
    }
}
