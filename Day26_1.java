public class Day26_1 {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, row, col, c)) {
                            board[row][col] = c;
                            if (solve(board)) {
                                return true;
                            } else {
                                board[row][col] = '.'; // backtrack
                            }
                        }
                    }
                    return false; // if no valid number is found
                }
            }
        }
        return true; // board is completely filled
    }

    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            // Check the row
            if (board[row][i] == c) return false;
            // Check the column
            if (board[i][col] == c) return false;
            // Check the 3x3 sub-box
            if (board[row/3*3 + i/3][col/3*3 + i%3] == c) return false;
        }
        return true;
    }
}

