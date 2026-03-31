class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> prefixMap = new HashMap<>();

        int count = 0;
        int currPrefixSum = 0;

        prefixMap.put(0,1);

        for(int num : nums) {
            currPrefixSum += num;

            int target = currPrefixSum - k;
            if(prefixMap.containsKey(target)) {
                count += prefixMap.get(target);
            }

            prefixMap.put(currPrefixSum, prefixMap.getOrDefault(currPrefixSum, 0) + 1);
        }

        return count;
    }
}