class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = Arrays.copyOf(nums, nums.length * 2);
        for (int i = nums.length; i < nums.length * 2; i++){
            ans[i]=nums[i-nums.length];
        }
        return ans;
    }
}