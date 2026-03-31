class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int n = nums.length;

       if(nums == null || n == 0 || k == 0 || k > n) return new int[]{};

       Map<Integer,Integer> map = new HashMap<>();
       for(int num : nums) {
          map.put(num, map.getOrDefault(num,0) + 1);
       }

       List<Integer>[] freq = new List[n + 1];
       for(int i = 0; i < freq.length; i++) {
        freq[i] = new ArrayList<>();
       }

       for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
        freq[entry.getValue()].add(entry.getKey());
       }

       int[] res = new int[k];
       int idx = 0;
       for(int i = freq.length - 1; i > 0; i--) {
        for(int j : freq[i]) {
           res[idx++] = j;

           if(idx >= k) {
            return res;
           }
        }
       }

       return res;
    }
}
