class Solution {
    public String reorganizeString(String s) {
        int[] freqs = new int[26];
        for(char c : s.toCharArray()) {
            freqs[c - 'a']++;
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        for(int i = 0; i< freqs.length; i++) {
            if(freqs[i] > 0) {
                maxHeap.offer(new int[] {freqs[i], i});
            }
        }

        int[] prev = null;
        StringBuilder res = new StringBuilder();

        while(!maxHeap.isEmpty() || prev != null) {
            if(maxHeap.isEmpty() && prev != null) {
                return "";
            }
            
            
            int[] curr = maxHeap.poll();
            res.append((char) (curr[1] + 'a'));
            curr[0]--;

            if(prev != null) {
                maxHeap.offer(prev);
                prev = null;
            }
            
            if(curr[0] > 0) {
                prev = curr;
            }
        }

        return res.toString();
    }
}