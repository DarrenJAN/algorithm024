package src;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class q433_minMutation {
    //这题未完成
    public int minMutation(String start, String end, String[] bank) {
        int count = 0;
        Set<String> stringSet = new HashSet<>();

        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i = 0;i<size;i++)
            {
                String cur_string = queue.poll();
                for(int j = 0;j<bank.length;j++)
                {
                    if(stringSet.contains(bank[j])) continue;

                    if(isChangeable(cur_string, bank[j]))
                    {
                        count++;
                        cur_string = bank[j];
                        stringSet.add(cur_string);
                        if(cur_string.equals(end))
                            return count;
                    }
                }

            }

        }
        return count;
    }

    public boolean isChangeable(String cur_string, String next_string)
    {
        char[] chars ={'A', 'C', 'G', 'T'};
        if( cur_string.length() != next_string.length())
            return false;

        //System.out.println(cur_string+ " "+ next_string);
        for(int i = 0;i<cur_string.length();i++)
        {
            for(int j = 0;j<4;j++)
            {
                char[] chars1 = cur_string.toCharArray();
                chars1[i] = chars[j];
                String tmp = new String(chars1);
                //System.out.println(chars1);
                //System.out.println(tmp);
                if(tmp.equals(next_string))
                    return true;
            }
        }
        return false;
    }
}
