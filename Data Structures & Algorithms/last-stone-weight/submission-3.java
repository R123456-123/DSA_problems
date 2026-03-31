class Solution {
    PriorityQueue<Integer> maxHeap;
    
    public int lastStoneWeight(int[] stones) {
      this.maxHeap = new PriorityQueue<>((a,b) -> b - a);
      
      for(int stone : stones) {
         maxHeap.offer(stone);
      }
      

      while(maxHeap.size() > 1) {
        int x = maxHeap.poll();
        int y = maxHeap.poll();

        if(x > y) {
          maxHeap.offer(x - y);
        } 

      }

      return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }

}
