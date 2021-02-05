public class day12_add_digits {
    //给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
    
    public int addDigits(int num) {
        if( num == 0)
        {
            return 0;
        } else
        {
            int count = 0;
            while(num != 0)
            {
                count += num %10;
                num = num/10;
            }
            if( count < 10)
            {
                return count;
            } else
                return addDigits(count);
        }
    }

}
