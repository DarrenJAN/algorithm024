package src;

public class q74_searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int i = 0;
        int j = 0;
        while( i < row && j < col)
        {
            if(matrix[i][j] == target)
                return true;
            //如果不是最后一排
            else if(i+1 < row)
            {
                if(matrix[i+1][j] <= target)
                    i++;
                else
                    j++;
            }
            //最后一排，直接col++
            else {
                j++;
            }
        }
        return false;
    }
}
