class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rows[] = new HashSet[9];
        Set<Character> cols[] = new HashSet[9];
        Set<Character> boxes[][] = new HashSet[3][3];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boxes[i][j] = new HashSet<>();
            }
        }

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                
                char val = board[r][c];

                if(val == '.') continue;

                int boxRow=r/3;
                int colRow=c/3;

                if(rows[r].contains(val) || cols[c].contains(val) || boxes[boxRow][colRow].contains(val)){
                    return false;
                }

                rows[r].add(val);
                cols[c].add(val);
                boxes[boxRow][colRow].add(val);




            }
        }

    return true;
    }
}
