import java.util.HashMap;

public class day25_lemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int numof5 = 0;
        int numof10 = 0;
        if(bills.length == 0)
            return true;

        for(int i =0;i<bills.length;i++)
        {
            if(bills[i] == 5)
                numof5 ++;
            else if(bills[i] == 10)
            {
                if(numof5 == 0)
                    return false;
                else{
                    numof5 --;
                    numof10 ++;
                }

            }else if(bills[i] == 20)
            {
                if( numof5 >= 1 && numof10 >= 1)
                {
                    numof10 --;
                    numof5 --;
                } else if (numof5 >= 3)
                {
                    numof5 = numof5-3;
                }else
                {
                    return false;
                }

            }
        }

        return true;
    }
}
