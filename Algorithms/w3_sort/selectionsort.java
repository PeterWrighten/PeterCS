
public class selectionsort
{
    private int[] a;
    private int size;

    public selectionsort(int[] b)
    {
        a = b;
        size = b.length;
    }

    public void swap(int i, int j)
    {
        int tem = a[i];
        a[i] = a[j];
        a[j] = tem;
    }

    public void display()
    {
        System.out.println("[");
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i] + ", ");

        }
        System.out.println("]");
    }
    
    public void sort()
    {
        int min;
        for( int i = 0; i < size; i++)
        {
            min = i;
            for(int j = i; j < size; j++)
            {
                if(a[j] < a[min])
                {
                    min = j;

                }
            }
            if(min != i)
            {
                swap(i, min);
            }
            
        }
       
    }

    public static void main(String[] args)
    {
        int[] a = {0, 9, 44, 6, 9, 6, 1, 3, 222};
        selectionsort s = new selectionsort(a);
        s.sort();
        s.display();
        


    }
}