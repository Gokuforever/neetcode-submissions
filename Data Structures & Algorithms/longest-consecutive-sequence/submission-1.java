class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        int ans = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i+1] == -1) {
                temp++;
            } else {
                temp = 0;
            }
            if (ans<temp) {
                ans = temp;
            }
        }
        return ans + 1;
    }
}
