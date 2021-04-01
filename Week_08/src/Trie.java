package src;

import src.DataStructure.TreeNode;

public class Trie {
    /** Initialize your data structure here. */
    private  TrieNode root;
    public Trie() {
        root  = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode trieNode = root;

        for(int i = 0;i < word.length();i++)
        {
            char cur = word.charAt(i);
            if(!trieNode.contain(cur))
            {
                trieNode.put(cur, new TrieNode());
            }
            trieNode = trieNode.get(cur);
        }
        trieNode.setEnd();
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode trieNode = root;

        for(int i = 0;i<word.length();i++)
        {
            char cur_char = word.charAt(i);
            if( !trieNode.contain(cur_char))
            {
                return false;
            } else
            {
                trieNode = trieNode.get(cur_char);
            }
        }
        return trieNode.isEnd();

    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode trieNode = root;
        for(int i = 0;i<prefix.length();i++)
        {
            char cur_char = prefix.charAt(i);
            if( !trieNode.contain(cur_char))
            {
                return false;
            } else
            {
                trieNode = trieNode.get(cur_char);
            }
        }
        return true;
    }
}

class TrieNode{
    private TrieNode links[];
    private boolean isEnd = false;
    private int R = 26;

    public TrieNode() {
        links = new TrieNode[R];
    }

    public void setEnd()
    {
        isEnd = true;
    }

    public boolean isEnd()
    {
        return isEnd;
    }

    public boolean contain(char ch)
    {
        if (links[ch - 'a'] == null)
            return false;
        else
            return true;
    }

    public TrieNode get(char ch)
    {
        return links[ch  - 'a'];
    }

    public void put(char ch, TrieNode node)
    {
        links[ch - 'a'] = node;
    }


}