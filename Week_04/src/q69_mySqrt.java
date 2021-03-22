package src;

public class q69_mySqrt {
    public int mySqrt(int x) {
        int  left = 0;
        int  right = x;

        while(left <= right)
        {
           // int mid = (left + right) /2;
            int mid = left + (right - left) /2;
            long tmp = mid * mid;
            if(tmp == x)
                return mid;
            else if (tmp < x)
            {
                left ++;
            }else
                right--;
        }
        return right;
    }

    public int mySqrt2(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
