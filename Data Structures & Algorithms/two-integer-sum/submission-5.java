class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Key: the number, Value: its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement exists in our map, we found the pair!
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, store the current number and its index
            map.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found (LeetCode guarantees one exists)
        return new int[]{-1, -1};
    }
}
