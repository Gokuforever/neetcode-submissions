class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            if (res.contains(num)) {
                continue;
            }
            if (map.getOrDefault(num, 0) + 1 > nums.length/3) {
                res.add(num);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return res;
    }
}