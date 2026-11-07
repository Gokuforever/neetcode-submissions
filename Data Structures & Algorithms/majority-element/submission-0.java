class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = 0;
        int element = 0;
        List<Integer> validated = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (validated.contains(nums[i])){
                continue;
            }
            validated.add(nums[i]);
            int temp = 0;
            for(int j = 0; j < nums.length;j++) {
                if (nums[i]==nums[j]){
                    temp++;
                }
            }
            if (temp>majorityElement){
                majorityElement = temp;
                element = nums[i];
            }
        }
        return element;
    }
}