package src;

public class Quick_Sort {
    public  void quickSort(int[] array, int begin, int end) {
        if(end <= begin)
            return;

        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot -1);
        quickSort(array, pivot+1, end);
    }

    public  int partition(int[] arrary, int begin, int end)
    {
        int pivot = end;
        int index = begin;
        for(int i = begin;i< end;i++)
        {
            if(arrary[i] < arrary[pivot])
            {
                int tmp = arrary[index];
                arrary[index] = arrary[i];
                arrary[i] = tmp;
                index ++;
            }

        }

        int tmp = arrary[pivot];
        arrary[pivot] = arrary[index];
        arrary[index] = tmp;
        return index;
    }

    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1,100,10};
        Quick_Sort quickSort = new Quick_Sort();
        quickSort.quickSort(a, 0, a.length-1);
        for(int i = 0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
