class Solution {
    public void setZeroes(int[][] matrix) {

        // flags to store whether first row and first column have zero
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // check first row
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRowHasZero = true;
            }
        }

        // check first column
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColHasZero = true;
            }
        }

        // mark rows and columns using first row and first column
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {   // FIXED: j condition
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // make column zero if marked in first row
        for (int j = 1; j < cols; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // make row zero if marked in first column
        for (int i = 1; i < rows; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // zero first row if needed
        if (firstRowHasZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // zero first column if needed
        if (firstColHasZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

