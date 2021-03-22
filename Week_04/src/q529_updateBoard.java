package src;

public class q529_updateBoard {
    int[] x = {1, 0, 1,  1,   0, -1,  -1, -1} ;
    int[] y = {0, 1, 1, -1,  -1,  0,  -1,  1};
    public char[][] updateBoard(char[][] board, int[] click) {
        int row = click[0];
        int col = click[1];
        if(board[row][col] == 'M')
        {
            board[row][col] = 'X';
            return board;
        }

        dfs(board, row, col);
        return board;
    }

    public void dfs(char[][] board, int row, int col)
    {
        int count  = 0;
        for(int i=0;i<8;i++)
        {
            int n_x = row + x[i];
            int n_y = col + y[i];

            if(n_x < 0 || n_y < 0 || n_x >= board.length || n_y >= board[0].length)
                continue;

            if(board[n_x][n_y] == 'M')
                count++;
        }
        if(count >0)
        {
            board[row][col] = (char)(count + '0');
        }else
        {
            board[row][col] = 'B';
            for(int i = 0; i<8;i++)
            {
                int n_x = row + x[i];
                int n_y = col + y[i];
                if(n_x < 0 || n_y < 0 || n_x >= board.length || n_y >= board[0].length )
                    continue;
                else
                {
                    if( board[n_x][n_y] != 'E')
                        continue;
                    else
                        dfs(board, n_x, n_y);
                }

            }
        }
    }
}
