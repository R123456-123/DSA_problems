class MedianFinder {
    Queue<Integer> smallData;
    Queue<Integer> largeData;

    public MedianFinder() {
       smallData = new PriorityQueue<>((a,b) -> b - a);
       largeData = new PriorityQueue<>((a,b) -> a - b);
    }
    
    public void addNum(int num) {
        smallData.add(num);
        if(
            smallData.size() - largeData.size() > 1 || 
            !largeData.isEmpty() && 
            smallData.peek() > largeData.peek()) {
            largeData.add(smallData.poll());
        }

        if(largeData.size() - smallData.size() > 1) {
            smallData.add(largeData.poll());
        }
    }
    
    public double findMedian() {
        if(smallData.size() == largeData.size()) {
            return (double) (smallData.peek() + largeData.peek()) / 2.0;
        } else if(smallData.size() > largeData.size()) {
            return (double) smallData.peek();
        } else {
            return (double) largeData.peek();
        }
    }
}
