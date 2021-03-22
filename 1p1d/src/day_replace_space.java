import java.util.ArrayList;

public class day_replace_space {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        //一开始用的arraylist, 但其实应该用stringbuilder就行了
        //ArrayList<Character> arrayList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<chars.length;i++)
        {
            if(chars[i] != ' ')
            {
                stringBuilder.append(chars[i]);
            }else{
                stringBuilder.append('%');
                stringBuilder.append('2');
                stringBuilder.append('0');
            }

        }

        return stringBuilder.toString();
    }
}
