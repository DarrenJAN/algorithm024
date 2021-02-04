import java.util.HashMap;

public class q70_clibing_stairs {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public int climbStairs(int n) {
        if(n  == 1)
        {
            return 1;
        } else if (n  == 2 )
        {
            return 2;
        } else
        {
            if(hashMap.containsKey(n))
            {
                return hashMap.get(n);
            }else {
                int tmp = climbStairs(n-1) + climbStairs(n- 2);
                hashMap.put(n, tmp);
                return  tmp;
            }

        }

    }
}
