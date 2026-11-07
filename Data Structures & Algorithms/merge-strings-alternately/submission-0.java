class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int i = arr1.length;
        int j = arr2.length;
        int size = i > j ? i : j;
        StringBuilder res = new StringBuilder(); 
        for (int index = 0; index < size; index++) {
            if (i>0) {
                res.append(arr1[index]);
                i--;
            }
            if (j>0) {
                res.append(arr2[index]);
                j--;
            }
        }
        return res.toString();
    }
}