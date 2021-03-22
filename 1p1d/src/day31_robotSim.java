import java.lang.reflect.Parameter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class day31_robotSim {
    Set<String> set = new HashSet<>();
    public int robotSim(int[] commands, int[][] obstacles) {
        int result = 0;
        int direction = 0; // 0: north, 1: east 2: south 3: west
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int startx = 0;
        int starty = 0;
        int endx = 0;
        int endy = 0;

        for(int i =0;i<obstacles.length;i++)
        {
            set.add(obstacles[i][0] + ","+ obstacles[i][1]);
        }
        for(int i = 0;i<commands.length;i++)
        {
            if(commands[i] == -2 || commands[i] == -1 )
            {
               direction =  changedirection(direction, commands[i]);
            } else
            {

                for(int j = 0;j < commands[i];j++)
                {
                    endx = startx + dx[direction];
                    endy = starty + dy[direction];

                    if(set.contains(endx + ","+ endy))
                        break;

                    startx = endx;
                    starty = endy;

                    result = Math.max(result, endx*endx + endy*endy);
                }
            }
        }

        return result;
    }



    public int changedirection(int direction, int command)
    {
        //向右转
        if(command == -1)
        {
            return (direction +1) %4;
        }else
        {
            if(direction == 0)
                return 3;
            else
                return direction-1;
        }
    }

}
