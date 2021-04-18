public class day62_validPalindrome {
    //这种方法超过时间限制
    //damn
    public boolean validPalindrome(String s) {
        for(int i = 0;i<s.length();i++)
        {
            String left = s.substring(0, i);
            String right = s.substring(i+1);
            String tmp = left + right;
            if(check_palindrome( tmp))
                return true;
        }
        return false;
    }

    public boolean check_palindrome(String s)
    {
        int length = s.length();

        if(length <= 1)
            return true;

        for(int i = 0; i< length /2;i++)
        {
            if(s.charAt(i) != s.charAt(length-i-1))
                return false;
        }
        return true;
    }

    //----------------------------------------------
    public boolean validPalindrome2(String s) {
        int left = 0;
        int right = s.length() -1;
        if(right <= 1)
            return true;
        while(left< right)
        {
            if(s.charAt(left) == s.charAt(right))
            {
                left ++;
                right --;
            } else
            {
                return check_palindrome_2(s, left+1, right) || check_palindrome_2(s, left , right-1);
            }
        }
        return true;
    }

    public boolean check_palindrome_2(String s, int left, int right)
    {
        for(int i = left,  j = right; i<j ;i++, j--)
        {
            if(s.charAt(i) != s.charAt(j))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        day62_validPalindrome day62_validPalindrome = new day62_validPalindrome();
        System.out.println(day62_validPalindrome.validPalindrome("abccba"));
    }
}
