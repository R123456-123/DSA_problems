class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        return Math.max(robbing(nums, 0, nums.length - 2), robbing(nums, 1, nums.length - 1));
    }

    static int robbing(int[] nums, int start, int end) {
        int[] cache = new int[nums.length];
        cache[start] = nums[start];
        cache[start + 1] = Math.max(nums[start], nums[start + 1]);
        
        for(int i = start + 2; i <= end; i++) {
            cache[i] = Math.max(cache[i - 1], cache[i - 2] + nums[i]);
        }

        return Math.max(cache[end - 1], cache[end]);
    }
}
