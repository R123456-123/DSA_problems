class MedianFinder {
    List<Integer> data;

    public MedianFinder() {
       data = new ArrayList<>(); 
    }
    
    public void addNum(int num) {
        data.add(num);
        Collections.sort(data);
    }
    
    public double findMedian() {
        double res = 0;
        if(data.size() % 2 == 0) {
          res = (double) (data.get((data.size() / 2) - 1) + data.get((data.size() / 2))) / 2;
        } else {
            res = (double) data.get(data.size() / 2);
        }

        return res;
    }
}
