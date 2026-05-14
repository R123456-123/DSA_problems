class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);

        int scenerio1 = findMax(0, nums.length - 2, nums);
        int scenerio2 = findMax(1, nums.length - 1, nums);

        return Math.max(scenerio1, scenerio2);
    }

    private int findMax(int start, int end, int[] nums) {
        int prev1 = 0;
        int prev2 = 0;

        for (int i = start; i <= end; i++) {
            int curr = Math.max(prev1 + nums[i], prev2);

            prev1 = prev2;
            prev2 = curr;
        }

        return prev2;
    }
}
