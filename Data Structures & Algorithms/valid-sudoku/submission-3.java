class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = board[i][j];
                
                // Only validate pre-filled numbers; skip empty cells
                if (number != '.') {
                    // Try to add tracking strings to the HashSet. 
                    // If .add() returns false, it means a duplicate already exists!
                    if (!seen.add(number + " in row " + i) ||
                        !seen.add(number + " in col " + j) ||
                        !seen.add(number + " in block " + (i / 3) + "-" + (j / 3))) {
                        return false; 
                    }
                }
            }
        }
        
        return true;
    }
}
