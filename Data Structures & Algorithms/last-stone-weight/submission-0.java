class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int s : stones) {
            maxHeap.offer(s);
        }

        while(maxHeap.size() > 1) {
            int s1 = maxHeap.poll();
            int s2 = maxHeap.poll();

            if(s1 == s2) {
                continue;
            } else {
                maxHeap.offer(s1 - s2);
            }
        }
        return (maxHeap.size() == 0) ? 0 : maxHeap.peek();
    }
}
