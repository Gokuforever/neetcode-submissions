class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int num: nums) {
            res.put(num, res.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> lMap = new LinkedHashMap<>();
        res.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(e-> lMap.put(e.getKey(), e.getValue()));

        int[] resArr = new int[k];
        for (int i = 0; i < k; i++) {
            resArr[i] = (int) lMap.keySet().toArray()[i];
        }
        return  resArr;

    }
}
