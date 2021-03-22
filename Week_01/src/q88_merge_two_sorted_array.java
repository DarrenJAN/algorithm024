public class q88_merge_two_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] nums1_copy = new int[m];
        /*
        Params:
        src – the source array.
        srcPos – starting position in the source array.
        dest – the destination array.
        destPos – starting position in the destination data.
        length – the number of array elements to be copied.
         */
        System.arraycopy(nums1, 0, nums1_copy, 0,m);

        int p1= 0; // nums1_copy
        int p2 = 0; //nums2
        int p = 0;  // nums1

        while( (p1 <m ) && (p2 < n))
        {
            if(nums1_copy[p1] < nums2[p2])
            {
                nums1[p] = nums1_copy[p1];
                p++;
                p1++;
            }else
            {
                nums1[p] = nums2[p2];
                p++;
                p2++;
            }
        }

        if(p1 < m)
        {
            System.arraycopy(nums1_copy, p1,nums1,p,m-p1);
        }

        if(p2 <n)
        {
            System.arraycopy(nums2, p2, nums1,p, n-p2);
        }
    }
}
