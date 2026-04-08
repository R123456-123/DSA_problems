class Solution {
    public int leastInterval(char[] tasks, int n) {

       int[] count = new int[26];
       for(char task : tasks) {
        int i = task - 'A';

        count[i]++;
       } 

       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
       for(int i : count) {
        if(i > 0) {
            maxHeap.offer(i);
        }
       }

       Queue<int[]> coolDown = new LinkedList<>();
       int time = 0;
       while(!maxHeap.isEmpty() || !coolDown.isEmpty()) {
           time++;

           if(maxHeap.isEmpty()) {
            time = coolDown.peek()[1];
           } else {
            int curr = maxHeap.poll() - 1;
            if(curr > 0) {
              coolDown.add(new int[] {curr, time + n});
            }
           }

           if(!coolDown.isEmpty() && coolDown.peek()[1] == time) {
            maxHeap.offer(coolDown.poll()[0]);
           }
       }
    return time;
    }
}
