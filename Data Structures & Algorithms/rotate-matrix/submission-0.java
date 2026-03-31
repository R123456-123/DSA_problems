class Solution {
    public void rotate(int[][] matrix) {
       int row = matrix.length;
       int col = matrix[0].length;
       
       reverse(matrix, row);

       for(int i = 0; i < row; i++) {
        for(int j = i; j < col; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
       } 
    }

    private void reverse(int[][] matrix, int row) {
        for(int i = 0; i < row/2 ; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[row - 1 - i];
            matrix[row - 1 - i] = temp;
        }
    }
}
