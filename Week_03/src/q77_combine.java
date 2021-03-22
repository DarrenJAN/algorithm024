package src;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class q77_combine {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(n,k, path, result, 1);
        return result;

    }

    public void dfs(int n , int k , List<Integer> path, List<List<Integer>> result, int index  )
    {
        if(path.size() == k)
        {
            result.add(new ArrayList<>(path));
            return;
        }else
        {
            for(int i = index; i<=n;i++)
            {
                path.add(i);
                dfs(n,k,path,result, i+1);
                path.remove(path.size()-1);
            }

        }
    }

}
