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

    }
}
