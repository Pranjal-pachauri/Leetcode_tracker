// Last updated: 7/13/2026, 10:15:24 AM
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allboard = new ArrayList<>();
        char[][] board = new char[n][n];
        
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        helper(board, allboard, 0);
        return allboard;
    }

    public void helper(char[][] board, List<List<String>> allboard, int col) {
        if (col == board.length) {
            saveBoard(board, allboard);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(i, col, board)) {
                board[i][col] = 'Q';
                helper(board, allboard, col + 1);
                board[i][col] = '.';
            }
        }
    }

    public boolean isSafe(int row, int col, char[][] board) {
     
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allboard) {
        List<String> newboard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            newboard.add(row);
        }

        allboard.add(newboard);
    }
}