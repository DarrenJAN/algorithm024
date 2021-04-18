package src;

public class Selection_Sort {
    //选择排序(Selection-sort)是一种简单直观的排序算法。它的工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
    //然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
    public void selectionsort(int[] arr)
    {

        for(int i = 0;i<arr.length-1;i++)
        {
            int min_index = i;

            for(int j = i+1; j<arr.length;j++)
            {
                if(arr[j] < arr[min_index])
                {
                    min_index = j;
                }

            }

            int tmp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1,100,10};
        Selection_Sort selectionsort = new Selection_Sort();
        selectionsort.selectionsort(a);
        for(int i = 0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
