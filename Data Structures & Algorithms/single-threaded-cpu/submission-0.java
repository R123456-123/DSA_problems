class Solution {
    public int[] getOrder(int[][] tasks) {
      PriorityQueue<int[]> available = new PriorityQueue<>((a,b) -> a[0] == b[0] ?
       Integer.compare(a[1],b[1]) : Integer.compare(a[0],b[0]));

       PriorityQueue<int[]> pendingTask = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

       int n = tasks.length;
       for(int i = 0; i < n; i++) {
        pendingTask.offer(new int[] {tasks[i][0], tasks[i][1], i});
       }
       
       int time = 0;
       int idx = 0;
       int[] res = new int[n];

       while(!pendingTask.isEmpty() || !available.isEmpty()) {
        while(!pendingTask.isEmpty() && pendingTask.peek()[0] <= time) {
            int[] task = pendingTask.poll();
            available.offer(new int[] {task[1], task[2]});
        }

        if(available.isEmpty()) {
           time = pendingTask.peek()[0];
           continue; 
        }

        int[] task = available.poll();
        time += task[0];
        res[idx++] = task[1];
       }

       return res;

    }
}