import java.util.Scanner;

public class mergesort_topdown
{
    

    public void merge(int[] ax, int start, int mid, int end)
    {
        int i = start;
        int j = mid + 1;
        int k = 0;
        int len = end - start + 1;
        int[] bx = new int[len];
        for(k = 0; k < len; k++ )
        {
            if(i > mid) bx[k] = ax[j++];//first array overflows;
            else if(j > end)    bx[k] = ax[i++];//second array overflows.
            else if(ax[j] < ax[i])   bx[k] =  ax[j++];
            else    bx[k] = ax[i++];
        }
        for(i = start, k = 0; i <= end; i++, k++)
        {
            ax[i] = bx[k];
        }
        
    }

    public void merge_sort(int[] ax, int start, int end)
    {
        if(start >= end)    return;
        int mid = start + (end - start) / 2;
        merge_sort(ax, start, mid);
        merge_sort(ax, mid + 1, end);
        merge(ax, start, mid, end);

    }

    public void display(int[] b)
    {
        System.out.println("[");
        for(int i = 0; i < b.length; i++)
        {
            System.out.println(b[i] + ", ");

        }
        System.out.println("]");
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] a;
        int i;
        System.out.println("How many numbers do you wanna input ?\n ");
        i = input.nextInt();
        a = new int[i];
        for(int j = 0; j < i; j++)
        {
            System.out.println("The number you wanna sort>> ");
            a[j] = input.nextInt();
        }
        input.close();
        mergesort_topdown s = new mergesort_topdown();
        s.merge_sort(a, 0, (i - 1));
        s.display(a);

    }

    

}