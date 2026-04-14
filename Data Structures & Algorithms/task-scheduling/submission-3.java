class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freqs = new int[26];
        for(char task : tasks) {
            freqs[task - 'A']++;
        }

        int maxF = Arrays.stream(freqs).max().getAsInt();
        int maxCount = 0;
        for(int freq : freqs) {
            if(freq == maxF) {
                maxCount++;
            }
        }


        int time = 0;
        time = (maxF - 1) * (n + 1) + maxCount;
        return Math.max(tasks.length, time);
    }
}
