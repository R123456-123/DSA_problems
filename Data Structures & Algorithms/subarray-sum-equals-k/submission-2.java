class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        int count = 0;
        int currPrefixSum = 0;

        map.put(0,1);

        for(int num : nums) {
            currPrefixSum += num;

            int target = currPrefixSum - k;

            if(map.containsKey(target)) {
                count += map.get(target);
            }

            map.put(currPrefixSum, map.getOrDefault(currPrefixSum, 0) + 1);
        }

        return count;
    }
}