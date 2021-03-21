package src;

public class q36_isValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        int[][] col = new int[9][9];
        int[][] row = new int[9][9];
        int[][] box = new int[9][9];
        for(int i = 0; i<9;i++)
        {
            for(int j = 0; j<9;j++)
            {
                if(board[i][j] == '.' )
                    continue;
                else
                {
                    int num = board[i][j] - '0';
                    int box_index = (i/3) *3 + j/3; // 这一点 很重要
                    if(col[j][num-1] >= 1) return false;
                    if(row[i][num-1] >= 1) return false;
                    if(box[box_index][num-1] >= 1) return false;

                    row[i][num-1] =1;
                    col[j][num-1] = 1;
                    box[box_index][num-1] = 1;
                }
            }

        }
        return true;
    }
}
