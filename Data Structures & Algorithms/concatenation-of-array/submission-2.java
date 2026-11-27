class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[n*2];
        
        for (int i = 0; i < n * 2; i++) {
            if (i >= n) {
                result[i] = nums[i-n]; 
            }else{
                result[i] = nums[i];
            }
        }
        return result;
    }
}