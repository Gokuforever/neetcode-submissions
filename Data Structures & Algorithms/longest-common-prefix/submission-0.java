class Solution {
    public String longestCommonPrefix(String[] strs) {
        int smallestStr = strs[0].length();
        for (String s : strs) {
            if (smallestStr > s.length()) {
                smallestStr = s.length();
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < smallestStr; i++) {
            char currentBoxChar = strs[0].charAt(i);
            for(String s : strs) {
                if (currentBoxChar!=s.charAt(i)){
                    return result.toString();
                }
            }   

            result.append(currentBoxChar);
            
        }
        return result.toString();
    }
}