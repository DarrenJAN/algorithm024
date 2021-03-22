import java.util.HashMap;

/*
1.暴力方法：
    2个string sorted
    比较是否相等
    O(nlogn)

2. hashmap
    s每个string的character 进行统计+1
    t每个character 进行-1
    看hashmap里面是否每个都是0
 */
public class q242_isAnagram {
    public boolean isAnagram(String s, String t) {
        char[] chars_s = s.toCharArray();
        char[] chars_t = t.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i= 0;i <chars_s.length;i++)
        {
            if(hashMap.containsKey(chars_s[i]))
                hashMap.put(chars_s[i], hashMap.get(chars_s[i])+1);
            else
                hashMap.put(chars_s[i], 1);
        }

        for(int i=0;i<chars_t.length;i++)
        {
            if(hashMap.containsKey(chars_t[i]))
                hashMap.put(chars_t[i], hashMap.get(chars_t[i])-1);
            else
                return false;
        }

        for(int i = 0;i<chars_s.length;i++)
        {
            if(hashMap.get(chars_s[i]) >0)
                return false;
        }

        return true;
    }
}
