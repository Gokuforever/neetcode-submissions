class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean searching = true;
            int temp = nums[i];
            if (temp == k) {
                count++;
            }
            for (int j = i+1; j < nums.length; j++) {
                temp = temp + nums[j];
                if (temp == k) {
                    count++;
                }
            }
        }
        return count;
    }

}