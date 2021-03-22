package src;

public class q37_solveSudoku {
    public void solveSudoku(char[][] board) {
        if(board.length == 0 || board  == null)
            return;

        dfs(board);
    }

    public boolean dfs(char[][] board)
    {
        for(int i = 0; i<9;i++)
        {
            for(int j = 0; j<9;j++)
            {
                if(board[i][j] == '.')
                {
                    for(char c = '1';c<= '9';c++)
                    {
                        if(valid(board, i, j, c))
                        {
                            board[i][j] = c;
                            if(dfs(board))
                                return true;
                            else
                                board[i][j] = '.';
                        }
                    }
                    return false;
                }

            }
        }
        return true;
    }

    public boolean valid(char[][] board, int row, int col, char c)
    {
        for(int i = 0;i <9;i++)
        {
          if(board[i][col] != '.' && board[i][col] ==  c) return false;
          if(board[row][i] != '.' && board[row][i] ==  c) return false;
          int box_index  = 3 * (row/3) + i/3;
          int box_index2 = 3 * (col /3) + i %3;
          if(board[box_index][box_index2] != '.' &&
             board[box_index][box_index2] == (char) c) return false;
        }

        return true;
    }
}
