import java.util.*;

public class q49_groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for(int i =0; i<strs.length;i++)
        {
            String tmp = strs[i];
            char[] tmp2 = tmp.toCharArray();
            Arrays.sort(tmp2);
            tmp = new String(tmp2);

            if(!hashMap.containsKey(tmp))
            {
                List<String> stringList = new ArrayList<>();
                stringList.add(strs[i]);
                hashMap.put(tmp, stringList);
            }else
            {
                List<String> stringList = hashMap.get(tmp);
                stringList.add(strs[i]);
            }
        }

        for(String key: hashMap.keySet())
        {
            res.add(hashMap.get(key));
        }

        return res;
    }
}
