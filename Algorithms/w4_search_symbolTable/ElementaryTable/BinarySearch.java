
public class BinarySearch{

    public Integer search(int[] nums, int start, int end, int target) {
        if(start > end)  return null;
        int mid = start + (end - start) / 2; // Avoid Overflow
        if(nums[mid] < target) return search(nums, mid + 1, end, target);
        else if(nums[mid] > target) return search(nums, start, mid, target);
        else   return mid;

       
    }


    
}
