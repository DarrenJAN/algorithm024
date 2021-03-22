import java.util.HashMap;

public class day23_climbStairs {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public int climbStairs(int n) {
        if(hashMap.containsKey(n))
            return hashMap.get(n);
        else {
            if(n == 1)
                return 1;
            else if( n== 2)
                return 2;
            else
            {
                int tmp = climbStairs(n-1) + climbStairs(n-2);
                hashMap.put(n, tmp);
                return tmp;
            }
        }
    }
}
