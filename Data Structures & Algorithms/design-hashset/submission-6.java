class MyHashSet {

    private static Integer ARRAY_SIZE = 100;
    private List<List<Integer>> buckets;
    public MyHashSet() {
        buckets = new ArrayList<>(ARRAY_SIZE);
        for (int i = 0; i < ARRAY_SIZE; i++) {
            buckets.add(null);
        }
    }
    
    public void add(int key) {
        int hash = getHash(key);
        List<Integer> elements = buckets.get(hash);
        if (elements == null) {
            List<Integer> list = new LinkedList<>();
            list.add(key);
            buckets.set(hash, list);
        } else {
            if (!elements.contains(key)) {
                elements.add(key);
            }
        }
    }
    
    public void remove(int key) {
        int hash = getHash(key);
        List<Integer> elements = buckets.get(hash);
        if (elements != null) {
            elements.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        int hash = getHash(key);
        List<Integer> elements = buckets.get(hash);
        return elements != null && elements.contains(key);
    }

    int getHash(int key) {
        return key % ARRAY_SIZE;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */