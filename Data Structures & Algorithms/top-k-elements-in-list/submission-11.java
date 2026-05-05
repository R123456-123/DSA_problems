class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();
       List<Integer>[] buckets = new ArrayList[nums.length + 1];

       for(int i = 0; i < buckets.length; i++) {
        buckets[i] = new ArrayList<>();
       } 

       for(int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
       }

       for(Map.Entry<Integer,Integer> entries : map.entrySet()) {
        buckets[entries.getValue()].add(entries.getKey());
       }

       int[] res = new int[k];
       int idx = 0;
       for(int i = buckets.length - 1; i > 0 && idx < k; i--) {
        for(int n : buckets[i]) {
            res[idx++] = n; 

            if(idx >= k) {
                return res;
            }
        }
       }

       return res;
    }
}
