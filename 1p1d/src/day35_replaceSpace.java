public class day35_replaceSpace {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0;i<chars.length;i++)
        {
            if(chars[i] == ' ') {
                stringBuilder.append("%20");
            }else
                stringBuilder.append(chars[i]);
        }

        return new String(stringBuilder);
    }
}
