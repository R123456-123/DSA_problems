class Solution {
    public int[] sortArray(int[] nums) {
        int[] res = new int[nums.length];

        if(nums == null || nums.length == 0) return res;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums) {
            minHeap.offer(num);
        }

        int i = 0;
        while(!minHeap.isEmpty()) {
            res[i++] = minHeap.poll();
        }

        return res;
    }
}