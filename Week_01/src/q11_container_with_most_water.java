public class q11_container_with_most_water {
    //输入：[1,8,6,2,5,4,8,3,7]
    //输出：49
    //解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。


    //思路：双指针，一个左边一个右边, 如果左边小，左边的指针向右移动一个；如果右边小，右边的指针向左移动
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int max_area = 0 ;
        while(left < right)
        {
            int min_height = Math.min(height[left],  height[right]);
            int cur_area = min_height * (right - left);

            max_area = Math.max(cur_area, max_area);

            if(height[left] < height[right])
            {
                left ++;
            } else
                right -- ;
        }
        return max_area;
    }
}
