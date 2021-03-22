package src;

import java.util.*;

public class q51_solveNQueens_2 {
    Set<Integer> columns = new HashSet<>();
    Set<Integer> diagonal1 = new HashSet<>();
    Set<Integer> diagonal2 = new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];


        for(int i = 0;i<n;i++)
            Arrays.fill(board[i], '.');

        dfs_backtrack(result, 0, n, board);
        return result;
    }

    public void dfs_backtrack(List<List<String>> result, int row, int n, char[][] board)
    {
        if(n == row)
        {
            result.add(generate(board,n));
            return;
        }

        for(int i = 0;i<n;i++)
        {
            int col = i;
            int d1 = row - i;
            int d2 = row + i;
            if(columns.contains(i)) continue;
            if(diagonal1.contains(d1)) continue;
            if(diagonal2.contains(d2)) continue;

            columns.add(i);
            diagonal1.add(d1);
            diagonal2.add(d2);
            board[row][i] = 'Q';
            dfs_backtrack(result, row+1, n,board);
            board[row][i] = '.';
            columns.remove(i);
            diagonal1.remove(d1);
            diagonal2.remove(d2);
        }
    }



    public List<String> generate(char[][] board, int n)
    {
        List<String>  result = new ArrayList<>();
        for(int i = 0; i<n;i++)
        {
            result.add(new String(board[i]));
        }
        return result;
    }

}
