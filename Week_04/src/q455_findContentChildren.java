package src;

import java.util.Arrays;

public class q455_findContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length == 0 || s.length == 0)
            return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int child_index = 0;
        for(int i = 0;i< s.length;i++)
        {
            if(child_index == g.length)
                return count;
            if(s[i] < g[child_index])
                continue;
            else
            {
                count++;
                child_index++;
            }
        }
        return count;
    }
}
