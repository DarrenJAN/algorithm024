package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class q17_letterCombinations {
    HashMap<Character, String> hashMap = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        hashMap.put('2', "abc");
        hashMap.put('3', "def");
        hashMap.put('4', "ghi");
        hashMap.put('5', "jkl");
        hashMap.put('6', "mno");
        hashMap.put('7', "pqrs");
        hashMap.put('8', "tuv");
        hashMap.put('9', "wxyz");

        dfs(result, 0, digits.toCharArray(), new StringBuilder());
        return result;
    }

    public void dfs(List<String> result, int index, char[] digits, StringBuilder stringBuilder)
    {
        if(index == digits.length -1)
        {
            result.add(new String(stringBuilder));
            return;
        }
        else
        {
            String cur = hashMap.get(digits[index]);
            char[] chars = cur.toCharArray();
            for(int i = 0; i<chars.length;i++)
            {
                stringBuilder.append(chars[i]);
                dfs(result,index+1,digits,stringBuilder);
                stringBuilder.deleteCharAt(index);
            }
        }
    }

}
