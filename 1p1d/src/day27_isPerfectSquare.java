public class day27_isPerfectSquare {
    /*
    1. 暴力求解
    一个一个试
     */
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (true) {
            int tmp = i * i;
            if (tmp == num)
                return true;
            else if (tmp > num)
                return false;
            i++;
        }
    }

    /*
    数学性质
    1+3+5+7 +　2n -1 = n^2;
     */
    public boolean isPerfectSquare2(int num) {
        int i = 1;
        while(num > 0)
        {
            num -= i;
            i+=2;
        }
        return num ==0 ? true : false;
    }
}
