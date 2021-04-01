package src;

import java.util.ArrayList;
import java.util.List;

public class q212_findWords {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();

        if (board.length == 0 || words.length == 0 || board[0].length == 0)
            return result;

        int row = board.length;
        int col = board[0].length;
        int wordlength = words.length;
        TrieNode trieNode = new TrieNode();

        for(int i = 0;i<wordlength;i++)
            trieNode.insert(words[i]);

        for(int i = 0;i<row;i++)
        {
            for(int j = 0; j<col;j++)
            {
                dfs(result, board, trieNode, "", i, j);
            }
        }

        return result;
    }

    public void dfs(List<String> result, char[][] board, TrieNode trieNode, String str, int row, int col)
    {
        if(row<0 || col <0 || row>= board.length || col >= board[0].length || trieNode == null)
        {
            return;
        }

        char cur_char = board[row][col];
        if(cur_char  == '.')
            return;

        str += cur_char;
        trieNode = trieNode.links[cur_char - 'a'];

        if(trieNode != null && trieNode.isEnd())
        {
            result.add(new String(str));
            trieNode.end = false;  // 防止重复
            return;
        }

        board[row][col] = '.';
        dfs(result, board, trieNode, str, row +1, col);
        dfs(result, board, trieNode, str, row -1 , col);
        dfs(result, board, trieNode, str, row, col+ 1);
        dfs(result, board, trieNode, str, row, col - 1 );
        board[row][col] = cur_char;
    }

    public class TrieNode
    {
        public  TrieNode  links[];
        public  int R = 26;
        public  boolean end = false;

        public TrieNode(){
            links = new TrieNode[R];
        }

        public boolean isEnd()
        {
            return end;
        }

        public void setEnd()
        {
            end = true;
        }

        public void insert(String word)
        {
            if(word == null || "".equals(word))
                return;

            TrieNode cur = this;
            for(int i = 0;i< word.length();i++)
            {

                char cur_char = word.charAt(i);
                if(cur.links[cur_char - 'a'] == null)
                {
                    cur.links[cur_char - 'a' ] = new TrieNode();
                }

                cur  = cur.links[cur_char - 'a'];
            }

            cur.setEnd();
        }


    }

    //https://leetcode-cn.com/problems/word-search-ii/solution/c-jian-dan-qing-xi-de-trieshu-ti-jie-by-talanto_li/
}
