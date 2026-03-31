class Solution {
    public int leastInterval(char[] tasks, int n) {
       // we make in arr count contains A-Z
       int[] counts = new int[26];
       for(char task : tasks) {
        counts[task - 'A']++;
       }

       // make maxHeap and store the count > 0
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
       for(int count : counts) {
        if(count > 0) {
           maxHeap.add(count);
        }
       }

       int time = 0;
       // cooldown queue which have an array stores 
       // [remaining task of particular, time after which start]
       Queue<int[]> coolDown = new LinkedList<>();

       while(!maxHeap.isEmpty() || !coolDown.isEmpty()) {
        time++;
          
          if(maxHeap.isEmpty()) {
            time = coolDown.peek()[1];   //then time = queue.peek()[1] now maxHeap is empty
          } else {
            int cnt = maxHeap.poll() - 1;
            if(cnt > 0) {
                //add in queue
                coolDown.add(new int[] {cnt, time + n});
            }
          }

          if(!coolDown.isEmpty() && coolDown.peek()[1] == time) {
            maxHeap.add(coolDown.poll()[0]);
          }
       }
       return time;
    }
}
