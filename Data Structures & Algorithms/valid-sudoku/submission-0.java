class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<Character>[]rows = new HashSet[9];
        Set<Character>[]cols = new HashSet[9];
        Set<Character>[][]boxes = new HashSet[3][3];
        

        for(int i=0; i<9;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
        }

        for(int r=0; r<3; r++){
            for(int c=0;c<3;c++){
                boxes[r][c]=new HashSet<>();
            }
            
        }

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char val = board[r][c];

                if (val == '.') {
                    continue;
                }

                int boxRow = r/3;
                int boxCol = c/3;

                if (rows[r].contains(val) || 
                    cols[c].contains(val) || 
                    boxes[boxRow][boxCol].contains(val)) {
                    return false;
                }
                rows[r].add(val);
                cols[c].add(val);
                boxes[boxRow][boxCol].add(val); 
            }
        }

        return true;
    }
}
