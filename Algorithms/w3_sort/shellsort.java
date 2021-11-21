import java.util.Scanner;

public class shellsort 
{
    private int[] a;
    private int size;
    public shellsort(int[] b)
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

    public void sort()
    {
        int h = 1;
        while(h < size / 3)
        {
            h = 3 * h + 1; 

        }
        while( h > 0 )
        {
            for(int i = h; i < size; i++)
            {
                for(int j = i; j >= h; j -= h)
                {
                    if(a[j] < a[j - h])
                    {
                        swap(j, j - h);
                    }
                }
            }
            h = h / 3;
        }
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
        shellsort s = new shellsort(a);
        s.sort();
        s.display();
    }

    
    
}
