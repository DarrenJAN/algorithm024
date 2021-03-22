public class day34_searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int i = 0;
        int j = 0;
        while( i < row && j < col)
        {
            if(matrix[i][j] == target)
                return true;
            else if(i+1 < row)
            {
                if(matrix[i+1][j] <= target)
                    i++;
                else
                    j++;
            }else {
                j++;
            }
        }
        return false;
    }
}
