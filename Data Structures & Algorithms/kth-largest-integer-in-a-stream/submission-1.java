class KthLargest {
    PriorityQueue<Integer> minHeap;
    int i;

    public KthLargest(int k, int[] nums) {
       i = k;
       minHeap = new PriorityQueue<>((a, b) -> a - b);

       for(int num : nums) {
        minHeap.offer(num);
       }
       
    }
    
    public int add(int val) {
        minHeap.offer(val);

        while(minHeap.size() > i) {
            minHeap.poll();
        }

        return minHeap.peek();
    }
}
