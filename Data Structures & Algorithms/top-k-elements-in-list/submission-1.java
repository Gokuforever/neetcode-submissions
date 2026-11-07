class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int num: nums) {
            res.put(num, res.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> objects = new PriorityQueue<>((a,b) -> res.get(a) - res.get(b));
        for (Integer i : res.keySet()) {
            objects.add(i);
            if (objects.size() > k) {
                objects.poll();
            }
        }
        int[] resArr = new int[k];
        while (k>0) {
            resArr[k-1] = objects.poll();
            k--;
        }
        return resArr;
}
}
