package src;

public class Bubble_Sort {
    public void bubblesort(int[] arr)
    {
        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j = 0; j < arr.length - i -1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int tmp =arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1,10};
        Bubble_Sort bubble_sort = new Bubble_Sort();
        bubble_sort.bubblesort(a);
        for(int i = 0;i<a.length;i++)
            System.out.println(a[i]);


    }
}
