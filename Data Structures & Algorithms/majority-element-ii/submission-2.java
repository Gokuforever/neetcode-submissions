class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int size = nums.length/3;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.entrySet().stream().filter(e-> e.getValue() > size).map(Map.Entry::getKey).toList();
    }
}