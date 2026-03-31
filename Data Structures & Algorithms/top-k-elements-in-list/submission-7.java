class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>[] fr = new List[nums.length + 1];

        for(int i = 0; i < fr.length; i++) {
            fr[i] = new ArrayList<>();
        }

        for(int n : nums) {
            map.put(n, map.getOrDefault(n,0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            fr[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int idx = 0;

        for(int i = fr.length - 1; i >= 0 && idx < k; i--) {
           for(int n : fr[i]) {
            res[idx++] = n;

            if(idx > k) {
                return res;
            }
           }
        }
        return res;
    }
}
