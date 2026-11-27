class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] charCount = new char[256];
        
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
            charCount[t.charAt(i)]--; 
        }

        for (int i = 0; i < t.length(); i++) {
            if (charCount[t.charAt(i)] != 0) return false;
        }
        return true;
    }
}
