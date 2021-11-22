public class mergesort_topdown
{
    private int[] a;
    private int size;
    private int[] result;
    public mergesort_topdown(int[] b)
    {
        a = b;
        size = b.length;
        result = new int[size];
    }

    public void merge(int start, int mid, int end)
    {
        for(int i = 0; i < mid + 1; i++)
        {
            result[i] =  a[i] < a[mid + 1 + i] ? a[i] : a[mid + 1 + i];
        }
        


    }

    public void merge_sort(int start, int end)
    {
        if(start >= end)
            return;
         
        int len = end - start;
        int mid = start + len>>1;
        merge_sort(start, mid);
        merge_sort(mid + 1, end);
        merge(start, mid, end);

    }

    public void mergesort()
    {

    }

}