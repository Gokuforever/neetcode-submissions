class Solution {
    public void sortColors(int[] nums) {
       int mid = 0;
       int low = 0;
       int high = nums.length - 1;

       while(mid<=high) {
        if (nums[mid] == 0) {
            swap(mid, low, nums);
            mid++;
            low++;
        } else if (nums[mid]==1) {
            mid++;
        } else if (nums[mid] == 2) {
            swap(mid, high, nums);
            high--;
        }
       }
    }

    public void swap(int source, int dest, int[] nums) {
        int temp = nums[dest];
        nums[dest] = nums[source];
        nums[source] = temp;
    }
}