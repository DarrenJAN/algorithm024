import java.util.ArrayList;
import java.util.List;

public class day42_findWords {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();

        dfs(board, 0,0,board.length,board[0].length, "", words,result);
        return result;

    }

    public void dfs(char[][] board, int x, int y, int row, int col, String string, String[] words,List<String> result)
    {
        if( check(string, words))
        {
            result.add(new String(string));
            return;
        }

        if(x<0 || y < 0 || x>= row || y>= col)
            return;
        else {
            dfs(board, x+1, y, row, col, string+ board[x][y], words, result);
            dfs(board, x-1, y, row, col, string+ board[x][y], words, result);
            dfs(board, x, y-1, row, col, string+ board[x][y], words, result);
            dfs(board, x, y+1, row, col, string+ board[x][y], words, result);
        }


    }


    public boolean check(String string, String[] words)
    {
        for(int i = 0 ;i<words.length;i++)
        {
            if(words[i].equals(string))
                return true;
        }
        return false;
    }
}
