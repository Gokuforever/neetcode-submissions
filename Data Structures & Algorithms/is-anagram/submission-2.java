class Solution {
     public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] charCounts = new int[256];


        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i)]++;
            charCounts[t.charAt(i)]--;
        }

        for (int i = 0; i < t.length(); i++) {
            if (charCounts[t.charAt(i)] != 0) return false;
        }
        return true;
    }
}
