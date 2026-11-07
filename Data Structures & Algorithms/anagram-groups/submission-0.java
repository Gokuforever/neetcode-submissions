
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map: Key = Sorted String, Value = List of matching original strings
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // 1. Convert the string to a character array and sort it
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            
            // 2. Convert the sorted array back into a String to use as a key
            String sortedKey = new String(chars);
            
            // 3. If the key doesn't exist in the map yet, initialize an empty list
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }
            
            // 4. Add the original string to its matching sorted category list
            map.get(sortedKey).add(s);
        }
        
        // Return all the grouped lists collected inside the map values
        return new ArrayList<>(map.values());
    }
}
