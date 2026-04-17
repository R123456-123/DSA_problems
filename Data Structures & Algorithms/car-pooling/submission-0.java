class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, Comparator.comparingInt(a -> a[1]));

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        int currPassenger = 0;

        for(int[] trip : trips) {
            int numPassenger = trip[0], start = trip[1], end = trip[2];

            while(!minHeap.isEmpty() && minHeap.peek()[0] <= start) {
                 currPassenger -= minHeap.poll()[1]; 
            }

            currPassenger += numPassenger;

            if(currPassenger > capacity) {
                return false;
            }

            minHeap.offer(new int[] {end, numPassenger});

        }

        return true;
    }
}