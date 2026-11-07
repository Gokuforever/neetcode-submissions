class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            int length = heights[left] < heights[right] ? heights[left] : heights[right];
            int width = right - left;
            int area = length * width;
            maxArea = area > maxArea ? area : maxArea;
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
