package src;

import java.lang.reflect.Array;

public class Merge_Sort {
    public void merge_sort(int[] arr, int left, int right)
    {
        if(left >= right)
            return;

        int mid = left + (right - left) /2;
        merge_sort(arr, left, mid);
        merge_sort(arr, mid +1, right);
        merge(arr, left, mid, right);

    }

    public void merge(int[] arr, int left, int mid, int right)
    {
        int[] tmp = new int[right - left +1];
        int i = left;
        int j = mid +1;
        int k =0;

        while(i <= mid && j <= right)
        {
            if(arr[i] < arr[j])
            {
                tmp[k++] = arr[i++];

            }else
            {
                tmp[k++] = arr[j++];
            }
        }

        while(i <= mid)
        {
            tmp[k++] = arr[i++];
        }

        while(j <= right)
        {
            tmp[k++] = arr[j++];
        }

        //array copy
        for(int p = 0; p<tmp.length;p++)
        {
            arr[p+left] = tmp[p];
        }
    }


    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1,100,10};
        Merge_Sort merge_sort = new Merge_Sort();
        merge_sort.merge_sort(a, 0, a.length-1);
        for(int i = 0;i<a.length;i++)
            System.out.println(a[i]);
    }

}
