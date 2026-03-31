class Solution {
    int ROWS;
    int COLS;
    public List<String> findWords(char[][] board, String[] words) {
       List<String> res = new ArrayList<>();
       ROWS = board.length;
       COLS = board[0].length;

       for(String word : words) {
        boolean flag = false;

        for(int r = 0; r < ROWS && !flag; r++) {
            for(int c = 0; c < COLS; c++) {
               if(board[r][c] != word.charAt(0)) continue;

               if(backtrack(board, word, r, c, 0)) {
                res.add(word);
                flag = true;
                break;
               }
            }
        }
       } 

       return res;
    }

    private boolean backtrack(char[][] board, String word, int r, int c, int i) {
        if(i == word.length()) {
            return true;
        }

        if(r < 0 || c < 0 || r >= ROWS || c >= COLS || board[r][c] != word.charAt(i)) {
            return false;
        }

        board[r][c] = '#';

        boolean ret = backtrack(board, word, r + 1, c, i + 1) ||
                      backtrack(board, word, r - 1, c, i + 1) ||
                      backtrack(board, word, r, c + 1, i + 1) ||
                      backtrack(board, word, r, c - 1, i + 1);

        board[r][c] = word.charAt(i);

        return ret;             
    }
}
