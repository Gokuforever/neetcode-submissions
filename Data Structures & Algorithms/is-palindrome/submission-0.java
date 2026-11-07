class Solution {
    public boolean isPalindrome(String s) {
        String[] split = s.split("[^a-zA-Z0-9]");
        char[] charArr = String.join("", split).toCharArray();
        int left = 0;
        int right = charArr.length - 1;
        char temp;
        while (left < right) {
            temp = charArr[left];
            if (Character.toLowerCase(charArr[left]) != Character.toLowerCase(charArr[right])) {
                return false;
            }
            charArr[right] = temp;
            left++;
            right--;
        }

        return true;
    }
}
