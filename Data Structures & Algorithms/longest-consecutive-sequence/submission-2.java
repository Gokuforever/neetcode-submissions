class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int ans = 0;
        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int temp = 1;
                while(set.contains(currentNum + 1)) {
                    currentNum++;
                    temp++;
                }
                if (ans < temp) {
                    ans = temp;
                }
            }
        }
        return ans;
    }
}
