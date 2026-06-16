class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> prefixS = new HashMap<>();

        int currSum = 0, res = 0;
        prefixS.put(0,1);

        for(int num : nums) {
            currSum += num;

            int diff = currSum - k;

            res += prefixS.getOrDefault(diff, 0);

            prefixS.put(currSum, prefixS.getOrDefault(currSum, 0) + 1);
        }

        return res;
    }
}