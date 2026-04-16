class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder res = new StringBuilder();

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((x,y) -> y[0] - x[0]);

        if(a > 0) { maxHeap.offer(new int[] {a, 'a'}); }
        if(b > 0) { maxHeap.offer(new int[] {b, 'b'}); }
        if(c > 0) { maxHeap.offer(new int[] {c, 'c'}); }

        while(!maxHeap.isEmpty()) {
            int[] f = maxHeap.poll();

            if(res.length() > 1 && res.charAt(res.length() - 1) == f[1] && res.charAt(res.length() - 2) == f[1]) {
               
               if(maxHeap.isEmpty()) break;
               int[] s = maxHeap.poll();
               res.append((char) s[1]);

               s[0]--;

               if(s[0] > 0) {
                maxHeap.offer(s);
               }

               maxHeap.offer(f);
            } else {
                res.append((char) f[1]);
                f[0]--;

                if(f[0] > 0) {
                    maxHeap.offer(f);
                }
            }
        }

        return res.toString();
    }
}