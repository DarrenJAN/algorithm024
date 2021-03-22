public class day26_numIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;

        for(int i =0 ;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                if(grid[i][j] == '1')
                {
                    DFS(grid, i, j, row, col);
                    count++;
                }
            }
        }
        return count;

    }

    void DFS(char[][] grid, int i, int j , int row , int col)
    {
        if(i>=0 && j >=0 && i<row && j <col){
            if(grid[i][j] == '1')
            {
                grid[i][j] = '0';
                DFS(grid, i-1, j, row, col);
                DFS(grid, i+1, j,row, col);
                DFS(grid, i , j +1, row, col);
                DFS(grid, i, j-1, row, col);
            }
        }
    }
}