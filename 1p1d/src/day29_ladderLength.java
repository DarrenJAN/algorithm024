import java.util.*;

public class q127_ladderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        Set<String> stringSet = new HashSet<>();

        int path = 0;
        queue.add(beginWord);
        while(!queue.isEmpty())
        {
            path++;
            int size = queue.size();
            for(int i = 0; i<size;i++)
            {
                String cur_string = queue.poll();
                for(int j= 0; j<wordList.size();j++)
                {
                    if(stringSet.contains(wordList.get(i)))
                        continue;
                    else
                    {
                        String to_be_change = wordList.get(i);
                        if(isChangeable(cur_string, to_be_change))
                        {
                            if(to_be_change.equals(endWord))
                                return path +1;
                            else
                            {
                                queue.offer(to_be_change);
                                stringSet.add(to_be_change);
                            }

                        }
                    }
                }
            }
        }
        return 0;

    }

    public boolean isChangeable(String a, String b )
    {
        if(a.length() != b.length())
            return false;
        int count = 0;
        for(int i = 0; i<a.length();i++)
        {
            if(a.charAt(i) != b.charAt(i))
                count++;
            if(count > 1)
                return false;
        }

        return  true;
    }

}
