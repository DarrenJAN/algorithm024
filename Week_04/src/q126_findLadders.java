package src;

import java.util.*;

public class q126_findLadders {
    //未完成 - -
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList)
    {
        List<List<String>> result = new ArrayList<>();

        List<String> path = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        Set<String> stringSet = new HashSet<>();
        while(! beginWord.isEmpty())
        {
            int size = queue.size();
            for(int i = 0; i<size;i++)
            {
                String cur_str = queue.poll();
                for(int j = 0;j<wordList.size();j++)
                {
                    String next_str = wordList.get(j);
                    if(stringSet.contains(next_str))
                        continue;
                    else
                    {
                        if(isChangeable(cur_str, next_str))
                        {
                            if(next_str.equals(endWord))
                            {
                                result.add(new ArrayList<>(path));
                            }else
                            {
                                queue.add(next_str);
                                stringSet.add(next_str);
                            }

                        }
                    }
                }
            }
        }
        return  result;
    }

    public void dfs(List<List<String>> result, List<String> path, String cur_string, String endWord, List<String> wordList)
    {
        if(cur_string == endWord)
        {
            result.add(new ArrayList<>(path));
            return;
        }

    }

    public boolean isChangeable(String cur_str, String next_str)
    {
        if(cur_str.length() != next_str.length())
            return false;

        int diff = 0;
        for(int i = 0;i<cur_str.length();i++)
        {
            if(cur_str.charAt(i) != next_str.charAt(i))
                diff++;
        }

        return diff == 1 ? true : false ;
    }
}
