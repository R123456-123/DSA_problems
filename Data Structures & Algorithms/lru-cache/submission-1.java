public class Node {
   int key, val;
   Node prev, next;

   public Node(int key, int value) {
    this.key = key;
    this.val = value;
    this.prev = null;
    this.next = null;
   }
}

public class LRUCache {
    int capacity;
    Map<Integer,Node> cache;
    Node head, tail;

    public LRUCache(int capacity) {
       this.capacity = capacity;
       this.cache = new HashMap<>();
       this.head = new Node(0,0);
       this.tail = new Node(0,0);
       head.next = tail;
       tail.prev = head;
    }
    
    public int get(int key) {
       if(cache.containsKey(key)) {
         Node node = cache.get(key);
         remove(node);
         insert(node);
        return node.val;
       }
       return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            Node node = cache.get(key);
            node.val = value;
            remove(node);
            insert(node);
        } else {
            if(cache.size() == capacity) {
                remove(tail.prev);
            }

            Node newNode = new Node(key, value);
            insert(newNode);
        }
    }

    private void remove(Node node) {
        cache.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {
        cache.put(node.key, node);
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node; 
        
    }
}
