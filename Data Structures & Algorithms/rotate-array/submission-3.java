class Solution {
    public void rotate(int[] nums, int k) {
       k = k % nums.length;
       int[] temp = new int[k];
       int i = 0;
       int j = nums.length - k;
       while (i < k) {
        temp[i++] = nums[j++];
       }
       for (int x = nums.length - 1; x >= k; x--) {
        nums[x] = nums[x-k];
       }
       for (int x = 0; x < k; x++) {
        nums[x] = temp[x];
       }
    }
}