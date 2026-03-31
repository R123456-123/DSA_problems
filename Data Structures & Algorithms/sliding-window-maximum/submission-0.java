class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
          
        if(nums == null || k > nums.length) return new int[]{};
        int n = nums.length;
        int[] res = new int[n - k + 1];

        for(int i = 0; i <= n - k; i++) {
            int maxNum = nums[i];
            for(int j = i + 1; j < i + k; j++) {
               maxNum = Math.max(maxNum, nums[j]);
            }

            res[i] = maxNum;
        }

        return res;
    }
}
