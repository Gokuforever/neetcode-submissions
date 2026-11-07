class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        for (int index = nums1.length - 1; index >= 0; index--) {
            int num1 = Integer.MIN_VALUE;
            int num2 = Integer.MIN_VALUE;
            if (i >= 0) {
                num1 = nums1[i];
            }
            if (j>=0) {
                num2 = nums2[j];
            }
            if (num1 > num2) {
                nums1[index] = num1;
                i--;
            } else {
                nums1[index] = num2;
                j--;
            }
        }
    }
}