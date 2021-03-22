public class day51_isPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num < 2)
            return true;

        int left = 0;
        int right = num /2;

        while(left <= right)
        {
             int mid = left + (right - left) /2;
             long tmp  = mid * mid;

             if(tmp == num)
                 return true;
             else if(tmp > num)
             {
                 right = mid -1;
             }else
                 left = mid +1;
        }

        return false;
    }
}
