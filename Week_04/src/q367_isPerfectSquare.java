package src;

public class q367_isPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num < 2)
             return  true;

        int left = 2;
        int right = num;
        while(left <= right)
        {
            int mid = left + (right - left) /2 ;
            int tmp = mid*mid;
            if(tmp == num)
                return true;
            else if(tmp < num)
                left = mid+1;
            else
                right = mid -1;
        }
        return false;
    }
}
