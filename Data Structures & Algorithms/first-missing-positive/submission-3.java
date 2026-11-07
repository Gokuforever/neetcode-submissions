class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 1; i <= nums.length; i++) {
            map.put(i, false);
        }
        for(int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, true);
            }
        }

        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (!entry.getValue()){
                return entry.getKey();
            }
        }
        return nums.length + 1;
    }
}