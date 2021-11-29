import java.util.Scanner;

public class insertionsort 
{
    private int[] a;
    private int size;
    public insertionsort(int[] b)
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
        for(int i = 0; i < size; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(a[j] < a[j - 1])
                {
                    swap(j, j-1);
                }
            }
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
        int j;
        System.out.println("How many numbers do you wanna input ?\n ");
        j = input.nextInt();
        a = new int[j];
        for(int k = 0; k < j; k++)
        {
            System.out.println("The number you wanna sort>> ");
            a[k] = input.nextInt();
        }
        input.close();
        insertionsort i = new insertionsort(a);
        i.sort();
        i.display();
    }
}
