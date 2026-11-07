class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int num: nums) {
            res.put(num, res.getOrDefault(num, 0) + 1);
        }
        int[] resArr = new int[k];

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (Integer i : res.keySet()) {
            bucket[res.get(i)].add(i);
        }
        List<Integer> tempList = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0; i--) {
            List<Integer> integers = bucket[i];
            for (Integer integer : integers) {
                tempList.add(integer);
            }
        }
        while (k>0) {
            resArr[k-1] = tempList.get(k-1);
            k--;
        }
        return resArr;
}
}
