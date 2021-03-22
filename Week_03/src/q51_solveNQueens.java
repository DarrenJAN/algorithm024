package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q51_solveNQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        char[][] chess = new char[n][n];
        for(int i = 0 ;i< n;i++)
            Arrays.fill(chess[i], '.');
        dfs(n, result, chess, 0);
        return result;
    }

    public void dfs(int n, List<List<String>> result, char [][] chess, int row )
    {
        //如果是最后一排了， 则构建答案
        if(row == n)
        {
            result.add(construct(chess, n));
            return;
        }else
        {
            for(int i =0;i<n;i++)
            {
                if(valid(chess, row, i))
                {
                    chess[row][i] = 'Q';
                    dfs(n, result, chess, row +1);
                    chess[row][i] = '.';
                }
            }
        }
    }

    public boolean valid(char[][] chess, int row , int col)
    {

        //判断当前列有没有皇后,因为他是一行一行往下走的，
        //我们只需要检查走过的行数即可，通俗一点就是判断当前
        //坐标位置的上面有没有皇后
        for (int i = 0; i < row; i++) {
            if (chess[i][col] == 'Q') {
                return false;
            }
        }
        //判断当前坐标的右上角有没有皇后
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        //判断当前坐标的左上角有没有皇后
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public List<String> construct(char[][] chess, int n)
    {
        List<String> result = new ArrayList<>();
        for(int i =0;i< n;i++)
        {
            result.add(new String(chess[i]));
        }
        return result;
    }
}
