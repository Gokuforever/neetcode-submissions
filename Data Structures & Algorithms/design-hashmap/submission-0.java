class MyHashMap {

    class Entity{
        int key;
        int value;

        public Entity(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static Integer BUCKET_SIZE = 100;
    List<List<Entity>> buckets;

    public MyHashMap() {
        buckets = new ArrayList<>();
        for(int i=0; i<BUCKET_SIZE; i++) {
            buckets.add(new LinkedList<>());
        }
    }
    
    public void put(int key, int value) {
        int hash = getHash(key);
        List<Entity> entities = buckets.get(hash);
        for (Entity entity : entities) {
            if (entity.key == key) {
                entity.value = value;
                return;
            }
        }
        entities.add(new Entity(key, value));
    }
    
    public int get(int key) {
        int hash = getHash(key);
        List<Entity> entities = buckets.get(hash);
        for (Entity entity : entities) {
            if (entity.key == key) {
                return entity.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int hash = getHash(key);
        List<Entity> entities = buckets.get(hash);
        Entity target = null;
        for (Entity entity : entities) {
            if (entity.key == key) {
                target = entity;
                break;
            }
        }
        if (target != null) {
            entities.remove(target);
        }
    }

    int getHash(int key) {
        return key % BUCKET_SIZE;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */