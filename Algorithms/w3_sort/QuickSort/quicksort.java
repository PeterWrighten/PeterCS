import java.util.Scanner;

public class Quicksort 
{
    public int partition(int[] nums, int lo, int hi)
    {
        int i = lo;
        int j = hi + 1;
        while(true)
        {
            while(nums[++i] < nums[lo])   
                if(i == hi) break;

            while(nums[--j] > nums[lo])
                if(j == lo) break;
                
            if(i >= j)  break;
            swap(nums, i, j);
        }
        swap(nums, lo, j);
        return j;

    }
    public void swap(int[] nums, int i, int j)
    {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void sort(int[] nums, int lo, int hi)
    {
        if(lo >= hi)    return;
        int mid = partition(nums, lo, hi);
        sort(nums, lo, mid - 1);
        sort(nums, mid + 1, hi);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Quicksort q = new Quicksort();
        System.out.println("How many numbers do you wanna sort?\n");
        int m = input.nextInt();
        int[] nums = new int[m];
        int i = 0;
        for(int j = 0; j < m; j++)
        {
            System.out.println("Insert numbers you wanna sort:\n");
            int p = input.nextInt();
            nums[j] = p;

        }
        input.close();
        q.sort(nums, 0, nums.length - 1);
        for(int x : nums)
        {
            System.out.println(x + " ");
        }
    }
    
}
