package src;

public class q980_uniquePathsIII {

    int result = 0;
    public int uniquePathsIII(int[][] grid) {
        int row =  grid.length;
        int col = grid[0].length;

        boolean[][] visited  = new boolean[row][col];
        int steps = 1;
        int startx = 0;
        int starty =0;
        for(int i = 0 ;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                if(grid[i][j] == 0)
                    steps++;
                else if(grid[i][j] == 1)
                {
                    startx = i;
                    starty = j;
                }
            }
        }

        dfs(startx, starty, row, col, grid, steps, visited);
        return result;

    }

    public void dfs(int x, int y, int row, int col, int[][] grid, int steps,  boolean[][] visited)
    {

        if(x < 0 || y< 0 || x >= row || y>= col)
            return;
        else if(grid[x][y] == -1 ||  visited[x][y] == true)
            return;

        if(steps == 0 )
        {
            if(grid[x][y]==2)
                result++;
            return;
        }else
        {
            //System.out.println(x+ " "+ y + " steps: " + steps + " " + grid[x][y]);
            visited[x][y] = true ;
            dfs( x, y+1, row,col, grid, steps-- , visited);
            dfs( x, y-1, row, col, grid, steps--, visited);
            dfs( x+1, y, row, col, grid, steps--, visited);
            dfs( x-1, y, row, col, grid, steps--, visited);
            visited[x][y] = false ;
        }
    }


    // 不知道为什么上面的没过
    int ans=0;
    public int uniquePathsIII_2(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int bushu=1;//存储从开始到结束需要走的步数
        int qibu[]=new int[2];//用于存储起点的坐标
        boolean[][] laiguo=new boolean[row][col];
        //矩阵laiguo用于记录某个位置是否走过
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){bushu++;}
                else if(grid[i][j]==1){
                    qibu[0]=i;
                    qibu[1]=j;
                }
            }
        }
        luxian(grid,laiguo,bushu,qibu[0],qibu[1]);
        return ans;
    }
    public void luxian(int[][] grid,boolean[][] laiguo,int bushu,int x,int y){
        //此方法用于判断每条道路是否可以走通
        if(x==grid.length||x<0||y==grid[0].length||y<0||laiguo[x][y]||grid[x][y]==-1){
            return;
        }
        else if(bushu==0){
            //bushu在每个嵌套方法中被减1，因此要在走完的时候判断是否够了步数，也就是bushu==0？
            if(grid[x][y]==2){ans++;}//判断正确道路，还应该终点到了2
            return;
        }
        else{//对四个方向继续进行搜索
            laiguo[x][y]=true;
            luxian(grid,laiguo,bushu-1,x+1,y);
            luxian(grid,laiguo,bushu-1,x-1,y);
            luxian(grid,laiguo,bushu-1,x,y+1);
            luxian(grid,laiguo,bushu-1,x,y-1);
            laiguo[x][y]=false;
        }
    }
}
