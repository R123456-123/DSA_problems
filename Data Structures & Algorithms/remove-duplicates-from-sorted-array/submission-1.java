class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }

        int l = 1, n = nums.length;

        for(int r = 1; r < n; r++) {
           if(nums[r] != nums[r - 1]) {
              nums[l++] = nums[r];
           }
        }

        return l;
    }
}