class MyHashSet {
    private int[] bits;

    public MyHashSet() {
       bits = new int[31251];    
    }
    
    public void add(int key) {
       bits[key / 32] = bits[key / 32] | bitmask(key);
    }
    
    public void remove(int key) {
        if(contains(key)) {
           bits[key / 32] = bits[key / 32] ^ bitmask(key);
        }
    }
    
    public boolean contains(int key) {
       return (bits[key / 32] & bitmask(key)) != 0; 
    }

    private int bitmask(int key) {
        return 1 << (key % 32);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */